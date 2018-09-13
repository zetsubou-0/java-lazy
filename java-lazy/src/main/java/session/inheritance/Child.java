package session.inheritance;

public class Child extends Parent {

    public Child() {
        x = 3;
    }

    @Override
    public String getName() {
        return super.getName() + " - Child";
    }
}
