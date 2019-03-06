package solution.andrei.game.console.csEnum.core.fight.impl;

import solution.andrei.game.console.csEnum.core.fight.Fight;
import solution.andrei.game.console.csEnum.core.player.Player;
import solution.andrei.game.console.csEnum.player.Team;

public class SimpleFight implements Fight {

    /**
     * solution.kiryl.game.console.SimpleFight
     * реализация дуэльных боев. Бой происходит 1 на 1 по 1 из каждой команды. Побеждает команда в которой осталось больше живых, есди кол-во ровное - то получаем "none"
     * алгоритм работы:
     *  - Проверяем размеры команд. Если в какой-то из них не 5 человек - выводим "Wrong team size" в консоль и выходим из метода возвращая Team.NONE
     *  - в цикле проходим по каждому игроку, таким образом, чтобы 1й бился с 1ым, 5й с 5ым
     *  - до начала боя выводим в консоль "Counter vs Terrorist - 1", ..., "Counter vs Terrorist - 5" для каждого из поединков
     *  - начинаем бой до смерти 1 из игроков. Каждый игрок наносит удар/выстрел по очереди (кто первый сами решайте). При смерти 1го из игроков дуэль заканчивается (жив ли игрок проверять методом isLive())
     *  	При нанесении урона выводить в консоль информацию о том, кто получил урон, сколько осталось хелов, сколько получил урона, остался ли жив. К примеру:
     *  	Terrorist [75] takes 25 damage, live
     * 	Counter [80] takes 20 damage, live
     * - После оканчания боя пройтись по массиву команд и посчитать кол-во выживших игроков в каждой
     * - На основе этих данных вернуть значение строкой, кто победил
     * @param counter неправильный размер
     * @param terrorist неправильный размер
     * @return победителя
     */



    @Override
    public String perform(Player[] counter, Player[] terrorist) {
        if (Team.COUNT != counter.length) {
            System.out.println("Неправильный размер команды контров");
            return Team.NONE;
        }
        if (Team.COUNT != terrorist.length) {
            System.out.println("Неправильный размер команды террористов");
            return Team.NONE;
        }

        int countLiveCounter = 0;
        int countLiveTerrorist = 0;

        for (int i = 0; i < Team.COUNT; i++) {
            System.out.println("Counter vs Terrorist - " + (i + 1));
            while (true) {
                counter[i].takeDamage(terrorist[i].getWeapon());
                System.out.print("Counter " + "[" + counter[i].getHeal() + "] " + terrorist[i].getWeapon() + ", ");
                if (!counter[i].isLive()) {
                    System.out.println("мертв");
                    countLiveTerrorist++;
                    break;
                } else {
                    System.out.println("жив");
                }
                terrorist[i].takeDamage(counter[i].getWeapon());
                System.out.print("Terrorist " + "[" + terrorist[i].getHeal() + "] " + counter[i].getWeapon() + ", ");
                if (!terrorist[i].isLive()) {
                    System.out.println("мертв");
                    countLiveCounter++;
                    break;
                } else {
                    System.out.println("жив");
                }
            }
            System.out.println();
        }
        return countLiveCounter < countLiveTerrorist ? " Команда террористов! " : " Команда контров! ";
    }
}
