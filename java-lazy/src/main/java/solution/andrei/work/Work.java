package solution.andrei.work;

public class Work {

    //сортировка по возрастанию
    public static int[] sortAscendingOne(int[] array) {
        int temp;
        for(int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = 0;
            } else {
                i++;
            }
        }
        return array;
    }

    //Сортировка по возрастанию
    public static int[]  sortAscendingTwo(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //Сортировка по убыванию
    public static int[] sortWaneOne(int[] array) {
        int temp;
        for (int i =0; i < array.length - 1; ) {
            if (array[i] < array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            } else {
                i++;
            }
        }
        return array;
    }

    //Сортировка по убыванию
    public static int[] sortWaneTwo(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //Вывод в консоль одномерного массива
    public static void output(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    //максимальный(минимальный) элемент массива
    public static void elementMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }

    //Отсортировать каждую строку по возрастанию(убыванию)
    public static int[][] sortWane(int[][] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1;) {
                if (array[i][j] > array[i][j + 1]) {
                    temp = array[i][j];
                    array[i][j] = array[i][j + 1];
                    array[i][j + 1] = temp;
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        return array;
    }

    //Вывод в консоль многомерного массива
    public static void outputMassif(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    //Сумма элементов главной диагонали
    public static void sumMainDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println(sum);
    }

    //Сумма элементов побочной диагонали
    public static void sumCollateralDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array.length - 1 - i];
        }
        System.out.println(sum);
    }

    //Максимальный нечетный элемент в главной диагонали
    public static void maxOddElementMainDiagonal(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] % 2 == 0 && max < array[i][i]){
                max = array[i][i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 8;
        array[1] = 6;
        array[2] = 14;
        array[3] = -1;
        array[4] = 23;
        array[5] = 2;
        array[6] = 2;
        array[7] = -5;
        array[8] = 8;
        array[9] = 15;


        output(sortAscendingOne(array));
        System.out.println();
        output(sortAscendingTwo(array));
        System.out.println();
        output(sortWaneOne(array));
        System.out.println();
        output(sortWaneTwo(array));
        System.out.println();

        int[][] arrays = {
                {5, -9, 10},
                {50, -5, 0},
                {-6, 7, 8}
        };

        elementMax(arrays);
        outputMassif(sortWane(arrays));
        sumMainDiagonal(arrays);
        sumCollateralDiagonal(arrays);
        maxOddElementMainDiagonal(arrays);
    }

}
