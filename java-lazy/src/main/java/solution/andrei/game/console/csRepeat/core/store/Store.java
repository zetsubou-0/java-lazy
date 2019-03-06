package solution.andrei.game.console.csRepeat.core.store;

import solution.andrei.game.console.csRepeat.core.player.Player;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

/**
 * Магазин для покупок
 * интерфейс магазина для покупки оружия игроком
 * на вход мы получаем игрока со всеми его данными и возвращаем оружие
 */
public interface Store {
    Weapon buy(Player player);
}
