package solution.kiryl.game.console.cs.core.player;

import solution.kiryl.game.console.cs.player.Player;

public interface PlayerGenerator {
    Player[] createCounterTeam();
    Player[] createTerroristTeam();
}
