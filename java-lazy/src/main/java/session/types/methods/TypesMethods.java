package session.types.methods;

import java.lang.reflect.Array;

public class TypesMethods {

    static int qwe;

    public static void main(String[] args) {
        int intVar;
        long longVar;
        byte byteVar;
        char charVar;
        double doubleVar;
        float floatVar;
        boolean booleanVar;
        short shortVar;

        String s;
        Boolean bb;
        Integer ii;
        Double dd;
        Array array;
        Object obj;

        System.out.println(qwe);

        intVar = 3;
        int k = 4;

        longVar = 5L;
        byteVar = 0b101;  // для наглядности
        charVar = 'A';
        doubleVar = 0.0;
        floatVar = 2.0F;
        booleanVar = true;
        shortVar = 0;

        doubleVar = floatVar;
        floatVar = (float) doubleVar;

        sum(4,7);

        superMethod(4, 5);
    }

    private static void ride() {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }

    private static int generateInt() {
        int a = 1;
        int b = 2;
        int c = a + b;
        return c;
    }

    private static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    private static int sqr(int a) {
        int c = a * a;
        return c;
    }

    private static void superMethod(int a, int b) {
//        sum(a, b);
        sum(sqr(a), b);
    }
}
