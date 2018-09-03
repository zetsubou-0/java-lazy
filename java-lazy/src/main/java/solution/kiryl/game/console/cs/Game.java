package solution.kiryl.game.console.cs;

import solution.kiryl.game.console.cs.core.fight.Fight;
import solution.kiryl.game.console.cs.core.fight.impl.SimpleFight;
import solution.kiryl.game.console.cs.core.player.PlayerGenerator;
import solution.kiryl.game.console.cs.core.player.impl.SimplePlayerGenerator;
import solution.kiryl.game.console.cs.player.Player;

public class Game {
    public static void main(String[] args) {
        PlayerGenerator playerGenerator = new SimplePlayerGenerator();

        Player[] counterTerroristTeam = playerGenerator.createCounterTeam();
        Player[] terroristTeam = playerGenerator.createTerroristTeam();

        printTeam(counterTerroristTeam);
        printTeam(terroristTeam);

        Fight fight = new SimpleFight();
        String winner = fight.perform(counterTerroristTeam, terroristTeam);
        System.out.println("Winner is: " + winner);
    }

    private static void printTeam(Player[] players) {
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println();
    }
}
