package solution.kiryl.game.console.cs.player;

import solution.kiryl.game.console.cs.weapon.Weapon;

public abstract class Player {

    protected int heal = 100;
    protected int money;
    protected Weapon weapon;
    protected boolean live = true;

    public void takeDamage(Weapon weapon) {
        heal -= weapon.getDamage();
        if (heal < 1) {
            heal = 0;
        }
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
        if (money > cost) {
            money -= cost;
        }
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public abstract boolean isTerrorist();

    public boolean isLive() {
        live = heal > 0;
        return live;
    }

    @Override
    public String toString() {
        return String.format("%s, money: %s, weapon: %s", (isTerrorist() ? "Terrorist" : "Counter"), money, weapon);
    }
}
