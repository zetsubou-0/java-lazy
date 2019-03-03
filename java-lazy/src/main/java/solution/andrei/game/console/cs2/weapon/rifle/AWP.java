package solution.andrei.game.console.cs2.weapon.rifle;

import solution.andrei.game.console.cs2.player.Team;
import solution.andrei.game.console.cs2.weapon.Weapon;

public class AWP extends Weapon {
    public AWP() {
        super(800, 50, Team.TERRORIST, "снайперка AWP");
    }
}
