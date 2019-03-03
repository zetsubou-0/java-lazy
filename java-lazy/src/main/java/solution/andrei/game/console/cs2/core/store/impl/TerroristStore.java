package solution.andrei.game.console.cs2.core.store.impl;

import solution.andrei.game.console.cs2.core.store.AbstractStore;
import solution.andrei.game.console.cs2.player.Team;
import solution.andrei.game.console.cs2.weapon.Weapon;

public class TerroristStore extends AbstractStore {

    protected  Weapon[] getAvailableWeapons() {
        return getAvailableWeapons(Team.TERRORIST);
    }
}
