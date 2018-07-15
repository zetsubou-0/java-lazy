package session.types;

public class Type {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        multiplier(a, b);
//        System.out.println(b);

//        System.out.println(check(true, false));
//        System.out.println(check(false, true));
//        System.out.println(check(false, false));

        double[] array = new double[4];
//        printArray(array);
//        arrayTest(array);
//        printArray(array);

        double[] x = arrayTest2(array);
//        printArray(array);
//        System.out.println();
//        printArray(x);

        Object[] objects = new Object[5];
//        updateObject(objects);
//        printObjectArray(objects);

        int[] testArray = {1 ,2 ,13 ,4 ,22 ,6 };
        for (int index = 0; index < testArray.length; index++) {
            if (index % 2 == 1) {
                System.out.println(testArray[index]);
            }
            if (testArray[index] % 2 == 1) {
                continue;
            }
            System.out.println(testArray[index]);
        }
    }

    private static void updateObject(Object[] objects) {
        int x = 3;
        int y = 2;
        objects[x] = new int[3];
        int[] val = (int[]) objects[x];             // приведение типов
        objects[val[y]] = x;
        objects[y] = "qwe";
    }

    public static double[] arrayTest(double[] arr) {    // arr -> array
                                                        // array -> new double[4];
                                                        // arr -> new double[4];
        arr = new double[2];                            // arr -> new double[2]; потерял ссылку на array
        return arr;
    }

    public static double[] arrayTest2(double[] arr) {    // arr -> array
        int x = 3;
        int y = 1;
        arr[y] = x;
        return new double[y];
    }

    public static void printObjectArray(Object[] array) {
        for (Object element : array) {
            System.out.println(element);
        }
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }

    public static int multiplier(int a, int b) {
        b = 10;
        return a * b;
    }

    public static int check(boolean x, boolean y) {
        if (x == true) return 1;
        if (y == true) return -1;
        else return 0;
    }
}
