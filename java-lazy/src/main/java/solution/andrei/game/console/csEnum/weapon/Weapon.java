package solution.andrei.game.console.csEnum.weapon;

import solution.andrei.game.console.csEnum.player.Team;

public enum  Weapon {
    AWP(800, 50,Team.TERRORIST, "снайперка AWP"),
    G3SG1(750, 45, Team.COUNTER, "винтовка G3SG1"),
    AutomaticKalashnikov(750, 40, Team.TERRORIST, "калаш"),
    AutomaticM8(650, 35, Team.COUNTER, "автомат М8"),
    DesertEagle(500, 30, Team.TERRORIST, "Desert Eagle"),
    P228(450, 25, Team.COUNTER, "пистолет P228"),
    Knife(0, 20, Team.BOTH, "нож");

    private final int cost;
    private final int damage;
    protected final String team;
    private final String name;

    Weapon(int cost, int damage, String team, String name) {
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
