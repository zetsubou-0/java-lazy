package solution.andrei.game.console.csEnum.core.store;

import solution.andrei.game.console.csEnum.core.player.Player;
import solution.andrei.game.console.csEnum.weapon.Weapon;

public interface Store {
    Weapon buy(Player player);
}
