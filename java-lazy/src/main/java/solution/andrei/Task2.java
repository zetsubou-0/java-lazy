package solution.andrei;
public class Task2 {
    public static void main (String[] args){

        double number = 12.5;
        System.out.println(translation(number));

        int value = 5;
        System.out.println(answer(value));

        long value2 = 6;
        System.out.println(mood(value2));

        System.out.println(mood((int)value2));

        line(35,-12);

        double[] element = new double[2];
        element [0] = 0.1;
        element [1] = 1.2;
        printElements(element);

        double[] element1 = new double[5];
        element1[0] = 0.1;
        element1[1] = -2;
        element1[2] = 3;
        element1[3] = 4;
        element1[4] = 2;
        vivodElement1(element1);

        System.out.println(sum(element1));

        System.out.println(proizvedenie(element1));

        int[] element2 = new int[5];
        element2[0] = 2;
        element2[1] = 5;
        element2[2] = 3;
        element2[3] = 4;
        element2[4] = 2;
        sqr(element2);

        sqrt(element2);

    }

    private static double translation (double number){
        return number / 100;
    }

    private static boolean answer (int value){
        if (value >= 0){
            return true;
        }else {
            return false;
        }
    }

    private static String mood (long value ){
        if (value > 0){
            return "positive";
        }else if (value < 0){
            return "negative";
        }else {
            return "zero";
        }
    }

    private static String mood (int val){
        return mood((long)val);
    }

    private static void line (int a, int b){
        System.out.print("start");
        if (a <= b ){
            while (a <= b ) {
                System.out.print(a + " ");
                a++;
            }
        }else {
            while (a >= b) {
                System.out.print(a + " ");
                a--;
            }
        }
        System.out.println("stop");
    }

    private static void printElements(double[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void vivodElement1(double[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 || a[i] <0){
                System.out.println(a[i]);
            }
        }
    }

    private static double sum (double[] b){
        double n = 0;
        for (int i = 0; i < b.length; i++) {
            n = n + b[i];
        }
        return n;
    }

    private static double proizvedenie (double[] b){
        double n = 1;
        for (int i = 0; i < b.length; i++) {
            n = n * b[i];
        }
        return n;
    }

    private static void sqr (int[] c){
        for (int i = 0; i < c.length; i++) {
            int n = c[i];
            System.out.println(n * n);
        }
    }

    private static void sqrt (int[] e){
        for (int i : e){
            System.out.println(i * i * i);
        }
    }
}
