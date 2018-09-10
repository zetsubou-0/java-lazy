package solution.andrei.work;

public class Work {
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

        int temp;

/*        for(int i = 0; i < array.length - 1; ) {  // сортировка по возрастанию 1
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = 0;
            } else {
                i++;
            }
        }
*/
/*        for (int i = 0; i < array.length; i++) {      // сортировка по возрастанию 2
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
*/
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

/*        for (int i = 0; i < array.length; i++) {       // сортировка по убыванию 2
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
*/

        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
