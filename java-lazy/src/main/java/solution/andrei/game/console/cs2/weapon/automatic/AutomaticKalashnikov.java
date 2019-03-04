package solution.andrei.game.console.cs2.weapon.automatic;

import solution.andrei.game.console.cs2.player.Team;
import solution.andrei.game.console.cs2.weapon.Weapon;

public class AutomaticKalashnikov extends Weapon {
    public AutomaticKalashnikov() {
        super(750, 40, Team.TERRORIST, "калаш");
    }
}
