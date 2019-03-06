package solution.andrei.game.console.csRepeat.weapon.automatic;

import solution.andrei.game.console.csRepeat.player.Team;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

/**
 * team - команда counter/terrorist (использовать константы класса solution.kiryl.game.console.cs.player.Team), если оружие доступно для обоих команд - solution.kiryl.game.console.cs.player.Team.BOTH
 * Во всех классах наследниках сделать видимым только один конструктор (без параметров), т.е каждое оружие будет создаваться с заведомо известными параметраметрами.
 */
public class AutomaticM8 extends Weapon {
    public AutomaticM8() {
        super(650, 35, Team.COUNTER, "автомат М8");
    }
}
