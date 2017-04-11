package main.java.session01;

public class MethodInvestigation {

    public static void main(String[] args) {
        String nyanko;
        printHelloWorld();
        nyanko = "neko";
        printHello(nyanko);
    }

    public static void printHelloWorld() {
        System.out.print("Hello");
        System.out.print(" ");
        System.out.println("world");
    }

    public static void printHello(String name) {
        System.out.print("Hello");
        System.out.print(" ");
        System.out.println(name);
    }

    public static String nameAndSquare() {

    }
}
