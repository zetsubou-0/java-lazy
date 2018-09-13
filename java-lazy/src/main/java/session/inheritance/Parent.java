package session.inheritance;

public class Parent {
    protected int x;
    protected int y;
    protected String name;

    public Parent() {
        x = 1;
        y = 20;
        print();
    }

    public String getName() {
        return "" + x + y + " - " + name;
    }

    public void print() {
        name = "parent";
        System.out.println(getName());
    }
}
