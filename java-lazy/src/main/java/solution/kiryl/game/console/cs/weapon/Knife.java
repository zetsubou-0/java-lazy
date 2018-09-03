package solution.kiryl.game.console.cs.weapon;

import solution.kiryl.game.console.cs.player.Team;

public class Knife extends Weapon {
    private Knife(int cost, int damage, String team) {
        super(cost, damage, team);
    }

    public Knife() {
        this(0, 5, Team.BOTH);
    }
}
