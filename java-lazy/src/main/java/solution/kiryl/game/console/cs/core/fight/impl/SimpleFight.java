package solution.kiryl.game.console.cs.core.fight.impl;

import solution.kiryl.game.console.cs.core.fight.Fight;
import solution.kiryl.game.console.cs.player.Player;
import solution.kiryl.game.console.cs.player.Team;

public class SimpleFight implements Fight {

    @Override
    public String perform(Player[] counter, Player[] terrorist) {
        if (counter.length != Team.COUNT || terrorist.length != Team.COUNT) {
            System.out.println("Wrong team size");
            return Team.NONE;
        }
        for (int i = 0; i < Team.COUNT; i++) {
            System.out.println("Counter vs Terrorist - " + (i + 1));
            fight(counter[i], terrorist[i]);
            System.out.println();
        }
        System.out.println();
        int csCount = 0;
        int terCount = 0;
        for (int i = 0; i < Team.COUNT; i++) {
            if (counter[i].isLive()) {
                csCount++;
            }
            if (terrorist[i].isLive()) {
                terCount++;
            }
        }
        if (csCount == terCount) {
            return Team.NONE;
        } else if (csCount > terCount) {
            return Team.COUNTER;
        }
        return Team.TERRORIST;
    }

    private void fight(Player counter, Player terrorist) {
        while (counter.isLive() && terrorist.isLive()) {
            terrorist.takeDamage(counter.getWeapon());
            System.out.printf("Terrorist [%s] takes %s damage, %s\n",
                    terrorist.getHeal(), counter.getWeapon().getDamage(), terrorist.isLive() ? "live" : "die");
            if (!terrorist.isLive()) {
                return;
            }
            counter.takeDamage(terrorist.getWeapon());
            System.out.printf("Counter [%s] takes %s damage, %s\n",
                    counter.getHeal(), terrorist.getWeapon().getDamage(), counter.isLive() ? "live" : "die");
        }
    }
}
