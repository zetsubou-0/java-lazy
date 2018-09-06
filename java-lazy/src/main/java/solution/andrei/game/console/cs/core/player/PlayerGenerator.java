package solution.andrei.game.console.cs.core.player;

import solution.andrei.game.console.cs.player.Player;

public interface PlayerGenerator {
    Player[] createCounterTeam();
    Player[] createTerroristTeam();
}
