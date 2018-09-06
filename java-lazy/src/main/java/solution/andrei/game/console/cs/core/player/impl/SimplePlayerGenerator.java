package solution.andrei.game.console.cs.core.player.impl;

import solution.andrei.game.console.cs.core.player.PlayerGenerator;
import solution.andrei.game.console.cs.player.Player;

public class SimplePlayerGenerator implements PlayerGenerator {

    public Player[] createCounterTeam() {
        return new Player[0];
    }

    public Player[] createTerroristTeam() {
        return new Player[0];
    }
}
