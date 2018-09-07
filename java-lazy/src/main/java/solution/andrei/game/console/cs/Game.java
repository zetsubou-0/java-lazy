package solution.andrei.game.console.cs;

import solution.andrei.game.console.cs.core.fight.Fight;
import solution.andrei.game.console.cs.core.fight.impl.SimpleFight;
import solution.andrei.game.console.cs.core.player.PlayerGenerator;
import solution.andrei.game.console.cs.core.player.impl.SimplePlayerGenerator;
import solution.andrei.game.console.cs.player.Player;

public class Game {

    private static void printTeam(Player[] players){
        System.out.println(players);
    }

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
}
