package session.base;

public class Session1 {

    public static void main(String[] args) {
        // простые типы
        float floatVal = 1.5F;
        double doubleVal = 1.5;
        int intVal = 100;
        char charVal = 'a';
        char charVal2 = 0xff;
        boolean booleanVal = true;
        long longVal = 100L;
        short shortVal = 100;
        byte byteVal = 100;

        // сложные или составные
        String stringVal = "neko";
        String[] vasya = {"neko", "neko"};
        int[] intArray = new int[2];
        Double doubleObjVal = 2.0;

        if (args.length > 0) {
            String argValue = args[0];
            switch (argValue) {
                case "cat" :
                    System.out.println("Hi cat");
                    break;
                case "dog" :
                    System.out.println("Hi dog");
                    break;
                default :
                    System.out.println("default");
            }
        }
        System.out.println();

        if (args.length == 2) {
            String val = args[1];
            int x = Integer.parseInt(val);
            if (x > 3) {
                System.out.println("x > 3");
            } else if (x < 10) {
                System.out.println("x < 10");
            } else if (x == 5) {
                System.out.println("x == 5");
            }
            if (x > 3) {
                System.out.println("x > 3");
            }
            if (x < 10) {
                System.out.println("x > 10");
            }
            if (x == 5) {
                System.out.println("x == 5");
            }
            System.out.println();
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
