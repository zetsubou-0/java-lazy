package solution.andrei.work;

public class Work {
    public static void main(String[] args) {
/*
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

        int temp;

        for(int i = 0; i < array.length - 1; ) {  // сортировка по возрастанию 1
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = 0;
            } else {
                i++;
            }
        }

/       for (int i = 0; i < array.length; i++) {      // сортировка по возрастанию 2
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i =0; i < array.length - 1;) {    // сортировка по убыванию 1
            if (array[i] < array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            } else {
                i++;
            }
        }

        for (int i = 0; i < array.length; i++) {       // сортировка по убыванию 2
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
*/
        int[][] arays = {
                {5, -9, 10},
                {50, -5, 0},
                {6, 7, 8}
        };

        //максимальный(минимальный) элемент массива
        int max = 0;
        for (int i = 0; i < arays.length; i++) {
            for (int j = 0; j < arays.length; j++) {
                if (max < arays[i][j]) {
                    max = arays[i][j];
                }
            }
        }
        System.out.println(max);

        //Отсортировать каждую строку по возрастанию(убыванию)
        int temp;
        for (int i = 0; i < arays.length; i++) {
            for (int j = 0; j < arays.length - 1;) {
                if (arays[i][j] > arays[i][j + 1]) {
                    temp = arays[i][j];
                    arays[i][j] = arays[i][j + 1];
                    arays[i][j + 1] = temp;
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        for (int i = 0; i < arays.length; i++) {
            for (int j = 0; j < arays.length ; j++) {
                System.out.print(arays[i][j]);
            }
            System.out.println();
        }

        //Сумма элементов главной диагонали
        int sum = 0;
        for (int i = 0; i < arays.length; i++) {
                sum += arays[i][i];
        }
        System.out.println(sum);

        //Сумма элементов побочной диагонали
        int sum2 = 0;
        for (int i = 0; i < arays.length; i++) {
            sum2 += arays[i][arays.length - 1 - i];
        }
        System.out.println(sum2);

        //Максимальный нечетный элемент в главной диагонали
        int max2 = 0;
        for (int i = 0; i < arays.length; i++) {
            if (arays[i][i] % 2 == 0 && max2 < arays[i][i]){
                max2 = arays[i][i];
            }
        }
        System.out.println(max2);
    }
}
