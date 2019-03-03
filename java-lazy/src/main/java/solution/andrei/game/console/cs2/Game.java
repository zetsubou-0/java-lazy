package solution.andrei.game.console.cs2;

import solution.andrei.game.console.cs2.core.fight.Fight;
import solution.andrei.game.console.cs2.core.fight.impl.SimpleFight;
import solution.andrei.game.console.cs2.core.player.Player;
import solution.andrei.game.console.cs2.core.player.PlayerGenerator;
import solution.andrei.game.console.cs2.core.player.impl.SimplePlayerGenerator;

public class Game {
    public static void main(String[] args) {
        PlayerGenerator playerGenerator = new SimplePlayerGenerator();
        Player[] counterTeam = playerGenerator.createCounterTeam();
        Player[] terroristTeam = playerGenerator.createTerroristTeam();

        printTeam(counterTeam);
        printTeam(terroristTeam);

        Fight fight = new SimpleFight();
        String winner = fight.perform(counterTeam, terroristTeam);
        System.out.println("Победила:" + winner);
    }
    private static void printTeam(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        System.out.println();
    }
}
