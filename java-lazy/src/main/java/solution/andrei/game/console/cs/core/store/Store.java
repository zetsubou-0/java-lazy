package solution.andrei.game.console.cs.core.store;

import solution.andrei.game.console.cs.player.Player;
import solution.andrei.game.console.cs.weapon.Weapon;


public interface Store {

    Weapon buy(Player player);
}
