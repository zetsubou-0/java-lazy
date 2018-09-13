package session.inheritance;

public class Child extends Parent {

    public Child() {
        super();
        x = 3;
        name = "child";
        print();
    }

    @Override
    public String getName() {
        return super.getName() + " - Child";
    }

    @Override
    public void print() {
        super.print();
    }
}
