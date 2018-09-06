package solution.andrei.game.console.cs.core.player.impl;

import solution.andrei.game.console.cs.core.player.PlayerGenerator;
import solution.andrei.game.console.cs.core.store.CounterStore;
import solution.andrei.game.console.cs.player.Counter;
import solution.andrei.game.console.cs.player.Player;
import solution.andrei.game.console.cs.player.Team;
import solution.andrei.game.console.cs.player.Terrorist;

public class SimplePlayerGenerator implements PlayerGenerator {

    private CounterStore counterStore = new CounterStore();

    public Player[] createCounterTeam() {

        Player[] players = new Player[Team.COUNT];
        for (int i = 0; i < Team.COUNT; i++){
            players[i] = new Counter();
            players[i].setMoney(300 + (int)Math.round(Math.random() * 700));
            counterStore.buy(players[i]);
        }
        return players;
    }

    public Player[] createTerroristTeam() {

        Player[] players = new Player[Team.COUNT];
        for (int i = 0; i < Team.COUNT; i++){
            players[i] = new Terrorist();
            players[i].setMoney(300 + (int)Math.round(Math.random() * 700));
            counterStore.buy(players[i]);
        }
        return players;
    }
}
