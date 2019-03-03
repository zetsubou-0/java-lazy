package solution.andrei.game.console.cs2.core.store;

import solution.andrei.game.console.cs2.core.player.Player;
import solution.andrei.game.console.cs2.weapon.Weapon;

public interface Store {
    Weapon buy(Player player);
}
