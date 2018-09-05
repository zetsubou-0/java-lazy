package solution.andrei.game.console.cs.core.store.impl;

import solution.andrei.game.console.cs.player.Player;
import solution.andrei.game.console.cs.player.Team;
import solution.andrei.game.console.cs.weapon.Weapon;
import solution.andrei.game.console.cs.weapon.knife.Knife;
import solution.andrei.game.console.cs.weapon.pistol.CounterPistols;
import solution.andrei.game.console.cs.weapon.pistol.Glock;
import solution.andrei.game.console.cs.weapon.pistol.R8;
import solution.andrei.game.console.cs.weapon.rifle.Kalash;
import solution.andrei.game.console.cs.weapon.rifle.M;

public abstract class AbstractStore {

    protected static final Weapon[] ALL_WEAPONS = new Weapon[6]; //создать константу, которая будеть содержать все виды оружия по убыванию урона

    static {
        ALL_WEAPONS [0] = new Kalash();
        ALL_WEAPONS [1] = new M();
        ALL_WEAPONS [2] = new CounterPistols();
        ALL_WEAPONS [3] = new Glock();
        ALL_WEAPONS [4] = new R8();
        ALL_WEAPONS [5] = new Knife();
    }

    protected Weapon[] getAvailableWeapons(String team){ // возвращает все доступные оружия для команды

        Weapon[] counter = new Weapon[5];
        counter [0] = ALL_WEAPONS [0];
        counter [1] = ALL_WEAPONS [2];
        counter [2] = ALL_WEAPONS [3];
        counter [3] = ALL_WEAPONS [4];
        counter [4] = ALL_WEAPONS [5];

        Weapon[] terrorist = new Weapon[5];
        terrorist [0] = ALL_WEAPONS [1];
        terrorist [1] = ALL_WEAPONS [2];
        terrorist [2] = ALL_WEAPONS [3];
        terrorist [3] = ALL_WEAPONS [4];
        terrorist [4] = ALL_WEAPONS [5];

        Weapon[] both = new Weapon[4];
        both [0] = ALL_WEAPONS [2];
        both [1] = ALL_WEAPONS [3];
        both [2] = ALL_WEAPONS [4];
        both [3] = ALL_WEAPONS [5];


        if (team.equals(Team.COUNTER )) return counter;
        if (team.equals(Team.TERRORIST)) return terrorist;
        if (team.equals(Team.BOTH)) return both;

        return null;
    }

    protected abstract Weapon[] getAvailableWeapons(); //  абстрактный метод, который вернет доступные орижия, должен быть реализован в дочерних классах. В дочерних стоит использовать вызов "protected Weapon[] getAvailableWeapons(String team)" со значением соответствующей команды

    public Weapon buy(Player player){
       // здесь же реализовать метод покупки, по следующему алгоритму:
       // - получить доступные оружия, вызвав getAvailableWeapons()
        //- пройтись в цикле по доступному оружию (оно лежит по убыванию урона)
        //- проверить достаточно ли денег у игрока на покупку. Если достаточно купить это оружие (списать деньги со счета и установить его игроку), если нет проверить следующее (если не хватит ни на одно у него должен появиться нож)
        return null;
    }
}
