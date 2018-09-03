package solution.kiryl.game.console.cs.weapon.pistol;

import solution.kiryl.game.console.cs.player.Team;
import solution.kiryl.game.console.cs.weapon.Weapon;

public class CounterPistol extends Weapon {
    private CounterPistol(int cost, int damage, String team) {
        super(cost, damage, team);
    }

    public CounterPistol() {
        this(600, 25, Team.COUNTER);
    }
}
