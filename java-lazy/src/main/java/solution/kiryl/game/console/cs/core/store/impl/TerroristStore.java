package solution.kiryl.game.console.cs.core.store.impl;

import solution.kiryl.game.console.cs.core.store.AbstractStore;
import solution.kiryl.game.console.cs.player.Team;
import solution.kiryl.game.console.cs.weapon.Weapon;

public class TerroristStore extends AbstractStore {

    @Override
    protected Weapon[] getAvailableWeapons() {
        return getAvailableWeapons(Team.TERRORIST);
    }
}
