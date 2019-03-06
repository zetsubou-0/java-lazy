package solution.andrei.game.console.csEnum.core.fight.impl;

import solution.andrei.game.console.csEnum.core.fight.Fight;
import solution.andrei.game.console.csEnum.core.player.Player;
import solution.andrei.game.console.csEnum.player.Team;

public class SimpleFight implements Fight {

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
