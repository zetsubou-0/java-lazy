package solution.andrei.game.console.cs2.weapon;

public class Weapon {
    private final int cost;
    private final int damage;
    protected final String team;
    private final String name;

    public Weapon(int cost, int damage, String team, String name) {
        this.cost = cost;
        this.damage = damage;
        this.team = team;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public String getTeam() {
        return team;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " урон: " + damage;
    }
}
