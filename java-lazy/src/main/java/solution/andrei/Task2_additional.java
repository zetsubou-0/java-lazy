package solution.andrei;


public class Task2_additional {
    public static void main (String[] args) {

        int a = 5;
        System.out.println(factorial(a));

        double[] element = new double[5];
        element[0] = 0.1;
        element[1] = 2.5;
        element[2] = 3.5;
        element[3] = 0.01;
        element[4] = 5.5;
        methodMaxMin(element);
    }

    private static int factorial(int x){

        if (x == 1){

            return 1;
        }
        else{

            return x * factorial(x - 1);
        }
    }

    private static double methodMaxMin (double[] a){
       return 0;
    }
}
