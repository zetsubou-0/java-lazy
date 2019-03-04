package solution.andrei.game.console.csRepeat.core.store;

import solution.andrei.game.console.csRepeat.core.player.Player;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

public interface Store {
    Weapon buy(Player player);
}
