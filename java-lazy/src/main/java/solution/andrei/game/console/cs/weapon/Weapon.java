package solution.andrei.game.console.cs.weapon;

public class Weapon {
    protected final int cost;
    protected final int damage;
    protected final String team;
    protected final String name;

    public Weapon(int cost, int damage, String team, String name) {
        this.cost = cost;
        this.damage = damage;
        this.team = team;
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public int getCost(){
        return cost;
    }

    public int getDamage(){
        return damage;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return " cost(стоимость): " + cost + ", damage(урон): " + damage + ", team(команда): " + team + " , оружие:" + name;
    }

}
