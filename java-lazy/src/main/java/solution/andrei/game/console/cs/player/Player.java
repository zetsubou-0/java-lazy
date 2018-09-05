package solution.andrei.game.console.cs.player;

import solution.andrei.game.console.cs.weapon.Weapon;

public abstract class Player {
    protected int heal;
    protected int money;
    protected Weapon weapon;
    protected boolean live;

    public abstract boolean isTerrorist();

    public void takeDamage(Weapon weapon) { //получение урона от оружия
        heal = heal - weapon.getDamage();
    }

    public int getHeal() { //получить текущее кол-во жизни

        return heal;
    }

    public int getMoney() {  //получить значение доступных средств (денег)
        return money;
    }

    public void setMoney(int money) {  //установить значение доступных средств (денег)
        this.money = money;
    }

    public void pay(int cost) {  //оплатить покупку. При вызове метода должна быть проверка достаточно ли денег на счету и если достаточно вычесть сумму
        if (cost < money) {
            money = money - cost;
        }
    }

    public void setWeapon(Weapon weapon) {  //установить оружие
        this.weapon = weapon;
    }

    public Weapon getWeapon() {  //прочитать оружие
        return weapon;
    }

    public boolean isLive() {  //метод должен возвращать мертв (false), если показатель жизни ниже переопределить метод toString, чтобы сделатиь читабельным вывод
        if (heal < 0) {
            live = false;
        }
        return live;
    }

}
