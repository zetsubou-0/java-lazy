package solution.kiryl.game.console.cs.weapon.pistol;

import solution.kiryl.game.console.cs.player.Team;
import solution.kiryl.game.console.cs.weapon.Weapon;

public class R8 extends Weapon {
    private R8(int cost, int damage, String team) {
        super(cost, damage, team);
    }

    public R8() {
        this(800, 45, Team.BOTH);
    }
}
