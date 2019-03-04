package solution.andrei.game.console.csRepeat.core.store;

import solution.andrei.game.console.csRepeat.core.player.Player;
import solution.andrei.game.console.csRepeat.player.Team;
import solution.andrei.game.console.csRepeat.weapon.Weapon;
import solution.andrei.game.console.csRepeat.weapon.automatic.AutomaticKalashnikov;
import solution.andrei.game.console.csRepeat.weapon.automatic.AutomaticM8;
import solution.andrei.game.console.csRepeat.weapon.knife.Knife;
import solution.andrei.game.console.csRepeat.weapon.pistol.DesertEagle;
import solution.andrei.game.console.csRepeat.weapon.pistol.P228;
import solution.andrei.game.console.csRepeat.weapon.rifle.AWP;
import solution.andrei.game.console.csRepeat.weapon.rifle.G3SG1;

public abstract class AbstractStore implements Store {
    protected static final Weapon[] ALL_WEAPONS = {
        new AWP(),
        new G3SG1(),
        new AutomaticKalashnikov(),
        new AutomaticM8(),
        new DesertEagle(),
        new P228(),
        new Knife()
    };

    //возвращает все доступные оружия для команды
    protected Weapon[] getAvailableWeapons(String team) {
        Weapon[] com = new Weapon[4];
        int j = 0;
        if (team.equals(Team.COUNTER) || team.equals(Team.TERRORIST)) {
            for (int i = 0; i < ALL_WEAPONS.length; i++) {
                if (team.equals(ALL_WEAPONS[i].getTeam()) || Team.BOTH.equals(ALL_WEAPONS[i].getTeam())) {
                    com[j++] = ALL_WEAPONS[i];
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
        for (int i = 0; i < com.length; i++) {
            if (player.getMoney() >= com[i].getCost()) {
                player.pay(com[i].getCost());
                player.setWeapon(com[i]);
                break;
            }
        }
        return player.getWeapon();
    }
}
