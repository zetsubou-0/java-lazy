package solution.andrei.game.console.csRepeat.weapon.knife;

import solution.andrei.game.console.csRepeat.player.Team;
import solution.andrei.game.console.csRepeat.weapon.Weapon;

/**
 * team - команда counter/terrorist (использовать константы класса solution.kiryl.game.console.cs.player.Team), если оружие доступно для обоих команд - solution.kiryl.game.console.cs.player.Team.BOTH
 * Во всех классах наследниках сделать видимым только один конструктор (без параметров), т.е каждое оружие будет создаваться с заведомо известными параметраметрами.
 * Должен существовать класс оружия Knife (Нож) с ценой в 0, т.е. его может позволить купить каждый ))
 * остальное оружие создать по усмотрению
 */
public class Knife extends Weapon {
    public Knife() {
        super(0, 20, Team.BOTH, "нож");
    }
}
