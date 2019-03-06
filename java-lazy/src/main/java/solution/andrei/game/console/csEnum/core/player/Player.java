package solution.andrei.game.console.csEnum.core.player;

import solution.andrei.game.console.csEnum.weapon.Weapon;

public abstract class Player {
    private int heal = 100;
    private int money;
    protected Weapon weapon;

    public abstract boolean isTerrorist();

    public void takeDamage(Weapon weapon) {
        this.heal = heal - weapon.getDamage();
        if (this.heal < 0) this.heal = 0;
    }

    public int getHeal() {
        return heal;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void pay(int cost) {
        this.money = money - cost;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public boolean isLive() {
        return getHeal() > 1;
    }

    @Override
    public String toString() {
        return  (isTerrorist() ? "Terrorist" : "Counter") + " деньги: " + money + ", оружие: " + weapon.getName() + ", урон: " + weapon.getDamage();
    }
}
