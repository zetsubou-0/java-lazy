package solution.kiryl.game.console.cs.weapon.pistol;

import solution.kiryl.game.console.cs.player.Team;
import solution.kiryl.game.console.cs.weapon.Weapon;

public class Glock extends Weapon {
    private Glock(int cost, int damage, String team) {
        super(cost, damage, team);
    }

    public Glock() {
        this(400, 20, Team.TERRORIST);
    }
}
