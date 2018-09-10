package solution.andrei.game.console.cs.weapon.pistol;

import solution.andrei.game.console.cs.weapon.Weapon;
import solution.andrei.game.console.cs.player.Team;

public class Glock extends Weapon {

    public Glock() {
        super(250, 50, Team.BOTH, "Glock");
    }
}
