package solution.andrei.game.console.cs2.weapon.knife;

import solution.andrei.game.console.cs2.player.Team;
import solution.andrei.game.console.cs2.weapon.Weapon;

public class Knife extends Weapon {
    public Knife() {
        super(0, 20, Team.BOTH, "нож");
    }
}
