package session02;

public class ConditionLoop {

    public static void main(String[] args) {

        // присвоить
        int x = 15;

        if (x < 0) {
            System.out.println("negative");
        }
        if (x > 0) {
            System.out.println("positive");
        }
        // равно ли
        if (x == 0) {
            System.out.println("zero");
        }


        // присвоить
        x = -15;

        if (x > 0) {
            System.out.println("> 0");
        } else if (x > 10) {
            System.out.println("> 10");
        } else if (x > 20) {
            System.out.println("> 20");
        }

        x = -25;
        if (x > 0) {
            System.out.println("> 0");
        } else if (x > 10) {
            System.out.println("> 10");
        } else if (x == 20) {
            System.out.println("> 20");
        }

        int[] numbers = new int[10];
        numbers[0] = 1 * 1;
        numbers[1] = 2 * 2;
        numbers[2] = 3 * 3;
        numbers[3] = 4 * 4;
        numbers[4] = 5 * 5;
        numbers[5] = 6 * 6;
        numbers[6] = 7 * 7;
        numbers[7] = 8 * 8;
        numbers[8] = 9 * 9;
        numbers[9] = 10 * 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);

        // while / do-while
        // for

        numbers = new int[10];
        int currentNumber = 1;
        while (currentNumber <= 10) {
            numbers[currentNumber - 1] = currentNumber * currentNumber;
            currentNumber = currentNumber + 1;
        }

        int index = 0;
        while (index < 10) {
            System.out.println(numbers[index]);
            index = index + 1;
        }
        System.out.println();
    }
}
