package session02;

public class Main {

    public static void main(String[] args) {
        int x; // не инициализированная переменная
        int y = 1;
        x = 2;

        boolean variableTrue = true;
        boolean variableFalse = false;

        // литералы
        String str = "qwe";
        int q = 1;

        String str2 = str;
        String str3 = str + str2;

        boolean b1 = variableTrue && variableTrue;  // && - логическое и - истина, если все истина
        boolean b2 = variableTrue || variableFalse;  // || - логическое или - истина, если хотя бы одно истина
        boolean b3 = !variableTrue;  // ! - логическое не - инверсия

        boolean b4 = getTrue();
        boolean b5 = getFalse();
/*
        System.out.println("invoked true");
        boolean b4 = true;
        System.out.println("invoked false");
        boolean b4 = false;
*/

        System.out.println("b4: " + b4);
        System.out.println("b5: " + b5);

        // true && false ... = false
        boolean b6 = getTrue() && getFalse() && getTrue() && getFalse();
        // false || true ... = true
        boolean b7 = getFalse() || getTrue() || getFalse() || getTrue();

        printHelloWorld();
        printHello("" + 1);
    }

    private static boolean getTrue() {
        System.out.println("invoked true");
        return true;
    }

    private static boolean getFalse() {
        System.out.println("invoked false");
        return false;
    }

    static void printHelloWorld() {
        printHello("world");
    }

    static void printHello(String name) {
        System.out.print("Hello");
        System.out.print(" ");
        System.out.println(name);
    }
}
