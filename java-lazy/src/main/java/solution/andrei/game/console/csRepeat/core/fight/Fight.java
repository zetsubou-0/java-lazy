package solution.andrei.game.console.csRepeat.core.fight;

import solution.andrei.game.console.csRepeat.core.player.Player;

/**
 * Иннтерфейс для проведения боев/перестрелок
 */
public interface Fight {

    /**
     * принимает 2 команды игроков и определяет победителя
     * @param counter none
     * @param terrorist none
     * @return команда - победитель
     */
    String perform(Player[] counter, Player[] terrorist);
}
