package solution.andrei.game.console.csEnum.core.player.impl;

import solution.andrei.game.console.csEnum.core.player.Counter;
import solution.andrei.game.console.csEnum.core.player.Player;
import solution.andrei.game.console.csEnum.core.player.PlayerGenerator;
import solution.andrei.game.console.csEnum.core.player.Terrorist;
import solution.andrei.game.console.csEnum.core.store.Store;
import solution.andrei.game.console.csEnum.core.store.impl.CounterStore;
import solution.andrei.game.console.csEnum.core.store.impl.TerroristStore;
import solution.andrei.game.console.csEnum.player.Team;

public class SimplePlayerGenerator implements PlayerGenerator {
    private Store counterStore = new CounterStore();
    private Store terroristStore = new TerroristStore();

    public Player[] createCounterTeam() {
        Player[] counter = new Player[Team.COUNT];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = new Counter();
            counter[i].setMoney(Math.round(300 + (int)((Math.random() * 10)) * 100));
            counterStore.buy(counter[i]);
        }
        return counter;
    }

    public Player[] createTerroristTeam() {
        Player[] terrorist = new Player[Team.COUNT];
        for (int i = 0; i < terrorist.length; i++) {
            terrorist[i] = new Terrorist();
            terrorist[i].setMoney(Math.round(300 + (int)((Math.random() * 10)) * 100));
            terroristStore.buy(terrorist[i]);
        }
        return terrorist;
    }
}
