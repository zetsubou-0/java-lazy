package solution.kiryl.game.console.cs.core.store;

import solution.kiryl.game.console.cs.player.Player;
import solution.kiryl.game.console.cs.weapon.Weapon;

public interface Store {
    Weapon buy(Player player);
}
