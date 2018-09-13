package session.inheritance;

public class Parent {
    protected int x;
    protected int y;
    protected String name;

    public Parent() {
        x = 1;
        y = 20;
    }

    public String getName() {
        return "" + x + y + " - " + name;
    }
}
