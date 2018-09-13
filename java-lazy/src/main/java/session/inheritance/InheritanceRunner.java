package session.inheritance;

public class InheritanceRunner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.getName());
        System.out.println(child.getName());
    }
}

/**
 * Andrei
 * 21 - null
 * 120 - null - Child
 */

/**
 * Vadim
 * 120 - null
 * 120 - null - Child
*/