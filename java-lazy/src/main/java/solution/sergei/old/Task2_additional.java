package solution.sergei.old;

/*
1. Создать рекурсивный меод, которая будет вычислять факториал числа.

2. Создать метод, который будет находить минимальный и максимальный элемент массива дробных чисел (double[]),
печатать их в консоль и возвращать среднее значение между максимальным и минимальным числом.

3. Создать метод который будет преобразовавать одномерный целочисленный массив в двухмерный.
Преобразование долно происходить по следующему закону:
 - на выходе получается двумерный массив 2-х срок равной длины (входной массив четной длины) или во втором ряду(массиве) на 1 эелемент меньше,
 если входной массив нечетной длины.
 - 1-й массив содержит четные элементы входного, 2-й  -  нечетные
 к примеру:
 входной                           выходной
 new int[] {1, 2, 3, 4}            new int[][] {new int[]{1,3}, new int[]{2, 4}}
 new int[] {1, 2, 3}               new int[][] {new int[]{1,3}, new int[]{2}}
*/

public class Task2_additional {
    public static void main(String[] args) {

        //  #1

        int a = 3;
        System.out.println(fact(a));

        // #2

        double[] c = new double[4];
        c[0] = 1.2;
        c[1] = 2.3;
        c[2] = 3.4;
        c[3] = 4.5;
        System.out.println("Average value: " + averageValue(c));

        // #3

        int[] b = {1, 2, 3, 4, 5, 6};

        System.out.println(mass(newMass(b)));

    }

        // #1

    private static int fact(int b){
        if (b > 1){
            return b * fact(b - 1);
            }
        else if (b == 1) {
            return 1;
        }
        return b;
    }

        //  #2

    private static double averageValue(double[] c) {
        double max = c[0], min = c[0];
        for (int i = 0; i < c.length; i++){
            if (c[i] > max)
                max = c[i];
            if (c[i] < min)
                min = c[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        return (max + min) / 2;
    }

        // #3

    private static int[] newMass(int[] b) {
        int[][] mass2 = new int[3][3];
        return b;
    }

    private static int mass(int[] mass2){

        return 0;
    }


}
