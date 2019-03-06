package solution.andrei.game.console.csRepeat.core.store.impl;

import solution.andrei.game.console.csRepeat.core.store.AbstractStore;
import solution.andrei.game.console.csRepeat.player.Team;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

/**
 * магазин с оружием контров
 */
public class CounterStore extends AbstractStore {
    /**
     * метод, который вернет доступные орижия для контров
     */
    protected Weapon[] getAvailableWeapons() {
        return getAvailableWeapons(Team.COUNTER);
    }
}
