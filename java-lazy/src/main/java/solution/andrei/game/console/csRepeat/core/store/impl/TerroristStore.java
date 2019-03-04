package solution.andrei.game.console.csRepeat.core.store.impl;

import solution.andrei.game.console.csRepeat.core.store.AbstractStore;
import solution.andrei.game.console.csRepeat.player.Team;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

public class TerroristStore extends AbstractStore {

    protected  Weapon[] getAvailableWeapons() {
        return getAvailableWeapons(Team.TERRORIST);
    }
}
