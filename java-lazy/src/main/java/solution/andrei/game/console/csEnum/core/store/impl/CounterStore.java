package solution.andrei.game.console.csEnum.core.store.impl;

import solution.andrei.game.console.csEnum.core.store.AbstractStore;
import solution.andrei.game.console.csEnum.player.Team;
import solution.andrei.game.console.csEnum.weapon.Weapon;

public class CounterStore extends AbstractStore {

    protected Weapon[] getAvailableWeapons() {
        return getAvailableWeapons(Team.COUNTER);
    }
}
