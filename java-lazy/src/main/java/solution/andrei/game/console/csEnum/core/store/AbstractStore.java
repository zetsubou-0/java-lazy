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

    protected abstract Weapon[] getAvailableWeapons();

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
