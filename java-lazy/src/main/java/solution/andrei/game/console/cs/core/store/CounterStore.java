package solution.andrei.game.console.cs.core.store;

import solution.andrei.game.console.cs.player.Team;
import solution.andrei.game.console.cs.weapon.Weapon;

public class CounterStore extends AbstractStore {

    protected Weapon[] getAvailableWeapons() {
        return getAvailableWeapons(Team.COUNTER);
    }
}
