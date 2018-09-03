package solution.kiryl.game.console.cs.core.store;

import solution.kiryl.game.console.cs.player.Player;
import solution.kiryl.game.console.cs.player.Team;
import solution.kiryl.game.console.cs.weapon.Knife;
import solution.kiryl.game.console.cs.weapon.Weapon;
import solution.kiryl.game.console.cs.weapon.pistol.CounterPistol;
import solution.kiryl.game.console.cs.weapon.pistol.Glock;
import solution.kiryl.game.console.cs.weapon.pistol.R8;

public abstract class AbstractStore implements Store {

    protected static Weapon[] ALL_WEAPONS = {
            new R8(),
            new CounterPistol(),
            new Glock(),
            new Knife()
    };

    protected abstract Weapon[] getAvailableWeapons();

    protected Weapon[] getAvailableWeapons(String team) {
        int count = 0;
        for (Weapon weapon : ALL_WEAPONS) {
            if (Team.BOTH.equals(weapon.getTeam()) || team.equals(weapon.getTeam())) {
                count++;
            }
        }
        Weapon[] result = new Weapon[count];
        int size = count;
        for (int i = 0; i < ALL_WEAPONS.length && count != 0; i++) {
            if (Team.BOTH.equals(ALL_WEAPONS[i].getTeam()) || team.equals(ALL_WEAPONS[i].getTeam())) {
                result[size - count] = ALL_WEAPONS[i];
                count--;
            }
        }
        return result;
    }

    @Override
    public Weapon buy(Player player) {
        for (Weapon weapon : getAvailableWeapons()) {
            if (weapon.getCost() < player.getMoney()) {
                player.pay(weapon.getCost());
                player.setWeapon(weapon);
                return weapon;
            }
        }
        return new Knife();
    }
}
