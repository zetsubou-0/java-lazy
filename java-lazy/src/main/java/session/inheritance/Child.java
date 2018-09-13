package session.inheritance;

public class Child extends Parent {

    public Child() {
        super();
        x = 3;
        print();
    }

    @Override
    public String getName() {
        return super.getName() + " - Child";
    }

    @Override
    public void print() {
        name = "child";
        super.print();
    }
}
