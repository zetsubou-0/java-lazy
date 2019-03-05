package solution.andrei.game.console.csEnum.core.store;

import solution.andrei.game.console.csEnum.core.player.Player;
import solution.andrei.game.console.csEnum.player.Team;
import solution.andrei.game.console.csEnum.weapon.Weapon;

public abstract class AbstractStore implements Store {
    protected static final Weapon[] ALL_WEAPONS = {
        Weapon.AWP,
        Weapon.G3SG1,
        Weapon.AutomaticKalashnikov,
        Weapon.AutomaticM8,
        Weapon.DesertEagle,
        Weapon.P228,
        Weapon.Knife
    };

    //возвращает все доступные оружия для команды
    protected Weapon[] getAvailableWeapons(String team) {
        Weapon[] com = new Weapon[4];
        int j = 0;
        if (team.equals(Team.COUNTER) || team.equals(Team.TERRORIST)) {
            for (Weapon a : ALL_WEAPONS) {
                if (team.equals(a.getTeam()) || Team.BOTH.equals(a.getTeam())) {
                    com[j++] = a;
                }
            }
        }
        return com;
    }

    //абстрактный метод, который вернет доступные орижия, должен быть реализован в дочерних классах. В дочерних стоит
    // использовать вызов "protected Weapon[] getAvailableWeapons(String team)" со значением соответствующей команды
    protected abstract Weapon[] getAvailableWeapons();


    //- получить доступные оружия, вызвав getAvailableWeapons()
    //- пройтись в цикле по доступному оружию (оно лежит по убыванию урона)
    //- проверить достаточно ли денег у игрока на покупку. Если достаточно купить это оружие (списать деньги со счета
    // и установить его игроку), если нет проверить следующее (если не хватит ни на одно у него должен появиться нож)
    public Weapon buy(Player player) {
        Weapon[] com = getAvailableWeapons();
        for (Weapon a : com) {
            if (player.getMoney() >= a.getCost()) {
                player.pay(a.getCost());
                player.setWeapon(a);
                break;
            }
        }
        return player.getWeapon();
    }
}
