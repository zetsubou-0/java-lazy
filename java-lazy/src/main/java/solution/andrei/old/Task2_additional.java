package solution.andrei.old;


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
        System.out.println("среднее значение:" + methodMaxMin(element));


        int[] element1 = new int[4];
        element1[0] = 1;
        element1[1] = 2;
        element1[2] = 3;
        element1[3] = 4;
        System.out.println("вывод многомерного массива:");
        arrayOutput(multidimensionalArrayConverter(element1));

    }

    private static int factorial(int x){
        if (x == 1){
            return 1;
        } else{
            return x * factorial(x - 1);
        }
    }

    private static double methodMaxMin (double[] a){
        double max = a[0] ;
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]){
                max = a[i];
            }else if (min > a[i]){
                min = a[i];
            }
        }
        System.out.println("максимальное число:" + max);
        System.out.println("минимальное число:" + min);
       return  (max + min)/2;
    }

    private static int[][] multidimensionalArrayConverter (int[] oneDimensionalArray) {
        int count = 0;
        int[][] multidimensionalArray = new int[2][2];
        for (int i = 0; i < multidimensionalArray.length; i++) {
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                multidimensionalArray[i][j] = oneDimensionalArray[count++];
            }
        }
        return multidimensionalArray;
    }
    private static void arrayOutput (int[][] multidimensionalArray) {
        for (int i = 0; i < multidimensionalArray.length; i++) {
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                System.out.print(multidimensionalArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
