package solution.andrei.game.console.csRepeat.core.player.impl;

import solution.andrei.game.console.csRepeat.core.player.Counter;
import solution.andrei.game.console.csRepeat.core.player.Player;
import solution.andrei.game.console.csRepeat.core.player.PlayerGenerator;
import solution.andrei.game.console.csRepeat.core.player.Terrorist;
import solution.andrei.game.console.csRepeat.core.store.Store;
import solution.andrei.game.console.csRepeat.core.store.impl.CounterStore;
import solution.andrei.game.console.csRepeat.core.store.impl.TerroristStore;
import solution.andrei.game.console.csRepeat.player.Team;

/**
 * Создать 1-ну реализацию данного интерфейса:
 *     solution.kiryl.game.console.SimplePlayerGenerator
 *     простой генератор игроков, по 5 в каждую команду на основе рандомного кол-ва денег на старте
 *     класс должен содержать в себе 2 реализации магазинов, как поля класса (можно константы класса), магазин терроров
 *      и магазин контров (тип у обоих должен быть solution.kiryl.game.console.Store)
 */
public class SimplePlayerGenerator implements PlayerGenerator {
    private Store counterStore = new CounterStore();
    private Store terroristStore = new TerroristStore();

    /**
     * алгоритм работы методов будет следующий:
     * создаем массив заведомо известной длины - 5 игроков
     * (можно использовать константу solution.kiryl.game.console.Team.COUNT)
     * создаем игрока соответствующей команды
     * (solution.kiryl.game.console.cs.player.Terrorist или solution.kiryl.game.console.cs.player.Counter)
     * - генерируем случайное кол-во денег в диапазоне 300 - 1000. Для генерации можно использовать
     * Math.random() - случайное число double от 0 до 1, Math.round() - для округления значений до long
     * - устанавливаем полученное значение денег в поле игрока
     * - для соответствующей команды делаем покупку в соответствующем магазине, у игрока должно установиться оружие, после покупки
     * @return команду контров
     */
    public Player[] createCounterTeam() {
        Player[] counter = new Player[Team.COUNT];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = new Counter();
            counter[i].setMoney(Math.round(300 + (int)((Math.random() * 10)) * 100));
            counterStore.buy(counter[i]);
        }
        return counter;
    }

    /**
     * @return команду тероров
     */
    public Player[] createTerroristTeam() {
        Player[] terrorist = new Player[Team.COUNT];
        for (int i = 0; i < terrorist.length; i++) {
            terrorist[i] = new Terrorist();
            terrorist[i].setMoney(Math.round(300 + (int)((Math.random() * 10)) * 100));
            terroristStore.buy(terrorist[i]);
        }
        return terrorist;
    }
}
