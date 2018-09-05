package solution.andrei.game.console.cs.weapon;

public class Weapon {
    protected final int cost;
    protected final int damage;
    protected final String team;


    public Weapon(int cost, int damage, String team) {
        this.cost = cost;
        this.damage = damage;
        this.team = team;
    }

    public int getDamage(){
        return damage;
    }

    public String toString(){
        return " cost: " + cost + ", damage: " + damage + ", team: " + team;
    }

}
