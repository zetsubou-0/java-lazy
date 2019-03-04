package solution.andrei.game.console.cs2.core.player;

import solution.andrei.game.console.cs2.weapon.Weapon;

public abstract class Player {
    private int heal = 100;
    private int money;
    protected Weapon weapon;

    public abstract boolean isTerrorist();

    //получение урона от оружия
    public void takeDamage(Weapon weapon) {
        this.heal = heal - weapon.getDamage();
        if (this.heal < 0) this.heal = 0;
    }

    //получить текущее количество жизни
    public int getHeal() {
        return heal;
    }

    //получить значение доступных денег
    public int getMoney() {
        return money;
    }

    //установить значение доступных денег
    public void setMoney(int money) {
        this.money = money;
    }

    //оплатить покупку. При вызове метода должна быть проверка достаточно ли денег на счету и если достаточно вычесть сумму
    public void pay(int cost) {
        this.money = money - cost;
    }

    //прочитать оружие
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //установить оружие
    public Weapon getWeapon() {
        return weapon;
    }

    //метод должен возвращать мертв (false), если показатель жизни ниже 1
    public boolean isLive() {
        return getHeal() > 1;
    }

    @Override
    public String toString() {
        return  (isTerrorist() ? "Terrorist" : "Counter") + " деньги: " + money + ", оружие: " + weapon.getName() + ", урон: " + weapon.getDamage();
    }
}
