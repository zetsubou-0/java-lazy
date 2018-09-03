package solution.kiryl.game.console.cs.core.player.impl;

import solution.kiryl.game.console.cs.core.player.PlayerGenerator;
import solution.kiryl.game.console.cs.core.store.Store;
import solution.kiryl.game.console.cs.core.store.impl.CounterStore;
import solution.kiryl.game.console.cs.core.store.impl.TerroristStore;
import solution.kiryl.game.console.cs.player.Counter;
import solution.kiryl.game.console.cs.player.Player;
import solution.kiryl.game.console.cs.player.Team;
import solution.kiryl.game.console.cs.player.Terrorist;

public class SimplePlayerGenerator implements PlayerGenerator {

    private Store csStore = new CounterStore();
    private Store terStore = new TerroristStore();

    @Override
    public Player[] createCounterTeam() {
        final Player[] team = new Player[Team.COUNT];
        for (int i = 0; i < Team.COUNT; i++) {
            team[i] = initPlayer(new Counter());
        }
        return team;
    }

    @Override
    public Player[] createTerroristTeam() {
        final Player[] team = new Player[Team.COUNT];
        for (int i = 0; i < Team.COUNT; i++) {
            team[i] = initPlayer(new Terrorist());
        }
        return team;
    }

    private Player initPlayer(Player player) {
        final int money = ((int) Math.round(Math.random() * 14) + 6) * 50;
        player.setMoney(money);
        if (player.isTerrorist()) {
            terStore.buy(player);
        } else {
            csStore.buy(player);
        }
        return player;
    }
}
