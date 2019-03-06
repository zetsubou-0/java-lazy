package solution.andrei.game.console.csRepeat.weapon.pistol;

import solution.andrei.game.console.csRepeat.player.Team;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

/**
 * team - команда counter/terrorist (использовать константы класса solution.kiryl.game.console.cs.player.Team), если оружие доступно для обоих команд - solution.kiryl.game.console.cs.player.Team.BOTH
 * Во всех классах наследниках сделать видимым только один конструктор (без параметров), т.е каждое оружие будет создаваться с заведомо известными параметраметрами.
 */
public class DesertEagle extends Weapon {
    public DesertEagle() {
        super(500, 30, Team.TERRORIST, "Desert Eagle");
    }
}
