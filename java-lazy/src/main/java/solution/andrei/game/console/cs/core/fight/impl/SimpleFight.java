package solution.andrei.game.console.cs.core.fight.impl;

import solution.andrei.game.console.cs.core.fight.Fight;
import solution.andrei.game.console.cs.player.Player;
import solution.andrei.game.console.cs.player.Team;

public class SimpleFight implements Fight {

    @Override
    public String perform(Player[] counter, Player[] terrorist) {

        if (counter.length != 5 || terrorist.length != 5){
            System.out.println("Wrong team size");
            return Team.NONE;
        }

        int index = 1;
        int terroristScore = 0;
        int counterScore = 0;

        for (int i = 0; i < counter.length; i++) {
            System.out.println("Counter vs Terrorist - " +  index);
            while (true) {
                counter[i].takeDamage(terrorist[i].getWeapon());
                System.out.print("Оперативный сотрудник получил урон, осталось хелов: " + counter[i].getHeal() + ", получил ургон: " + terrorist[i].getWeapon() + ", ");
                if (counter[i].isLive()) {
                    System.out.println("остался жив");
                    terrorist[i].takeDamage(counter[i].getWeapon());
                    System.out.print("Террорист получил урон, осталось хелов: " + terrorist[i].getHeal() + ", получил ургон: " + counter[i].getWeapon() + ", ");
                    if (terrorist[i].isLive()) {
                        System.out.println("остался жив");
                    } else {
                        System.out.println("мертв");
                        counterScore++;
                        index++;
                        break;
                    }
                } else {
                    System.out.println("мертв");
                    terroristScore++;
                    index++;
                    break;
                }
            }
        }

        return terroristScore > counterScore ? "победитель: Террорист" : "победитель: Оперативный сотрудник";
    }
}
