package session.inheritance;

public class InheritanceRunner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

    }
}

// 120 - parent
// 120 - parent - Child
// 320 - parent - Child


/**
 * Andrei
 * 120 - parent
 * 120 - parent
 * 120 - parent
 */

/**
 * Vadim
 * 120 - parent
 * 320 - child
 * 320 - child
*/