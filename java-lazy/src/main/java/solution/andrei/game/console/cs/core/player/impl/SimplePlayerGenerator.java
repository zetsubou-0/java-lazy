package solution.andrei.game.console.cs.core.player.impl;

import solution.andrei.game.console.cs.core.player.PlayerGenerator;
import solution.andrei.game.console.cs.core.store.CounterStore;
import solution.andrei.game.console.cs.core.store.TerroristStore;
import solution.andrei.game.console.cs.player.Counter;
import solution.andrei.game.console.cs.player.Player;
import solution.andrei.game.console.cs.player.Team;
import solution.andrei.game.console.cs.player.Terrorist;

public class SimplePlayerGenerator implements PlayerGenerator {

    public Player[] createCounterTeam() {
        CounterStore counterStore = new CounterStore();
        Player[] players = new Player[Team.COUNT];
        for (int i = 0; i < Team.COUNT; i++){
            players[i] = new Counter();
            players[i].setMoney(300 + (int)Math.round(Math.random() * 700));
            counterStore.buy(players[i]);
        }
        return players;
    }

    public Player[] createTerroristTeam() {
        TerroristStore terroristStore = new TerroristStore();
        Player[] players = new Player[Team.COUNT];
        for (int i = 0; i < Team.COUNT; i++){
            players[i] = new Terrorist();
            players[i].setMoney(300 + (int)Math.round(Math.random() * 700));
            terroristStore.buy(players[i]);
        }
        return players;
    }
}
