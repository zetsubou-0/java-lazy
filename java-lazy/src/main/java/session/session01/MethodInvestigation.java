package session.session01;

public class MethodInvestigation {
    String name; // null
    int age = 12; // 0

    public static void main(String[] args) {
        String nyanko;
        printHelloWorld();
        nyanko = "neko";
        printHello(nyanko);
        String res = nameAndSquare("chinko", 3);
        System.out.println(res);

        String x;
        x = "world " + 25;
        printHello(x);

        printHello(nameAndSquare("world", 5));

    }

    static void printHelloWorld() {
        System.out.print("Hello");
        System.out.print(" ");
        System.out.println("world");
    }

    static void printHello(String name) {
        System.out.print("Hello");
        System.out.print(" ");
        System.out.println(name);
    }

    static String nameAndSquare(String word, int number) {
        return word + " " + (number * number);
    }

    void printInfo() {
        System.out.println(age);
    }
}
