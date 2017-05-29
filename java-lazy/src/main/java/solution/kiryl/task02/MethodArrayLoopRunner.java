package solution.kiryl.task02;

public class MethodArrayLoopRunner {

    public static void main(String[] args) {
        double percent = 12.5;
        System.out.printf("%.3f%% = %.3f", percent, percentToNumber(percent));
        System.out.println();
        System.out.println();

        int positiveNumber = 10;
        System.out.printf("%d число положительное - '%s'", positiveNumber, isPositive(positiveNumber));
        System.out.println();
        System.out.println();

        int negativeNumber = -10;
        System.out.printf("%d число - '%s'", negativeNumber, numberSignToText(negativeNumber));
        System.out.println();
        System.out.println();

        int zeroNumber = 0;
        System.out.printf("%d число - '%s'", zeroNumber, numberSignToTextWithoutCondition(zeroNumber));
        System.out.println();
        System.out.println();

        int start = 3;
        int stop = -6;
        System.out.printf("Последовательность чисел от %d до %d:", start, stop);
        System.out.println();
        printSequence(start, stop);
        System.out.println();

        double[] doubleArrayToPrint = new double[] {3.0, 1.2, 7.0};
        System.out.println("Все элементы массива 'doubleArrayToPrint':");
        printDoubleArray(doubleArrayToPrint);
        System.out.println();

        int[] intArrayToPrint = new int[] {3, 2, 1, 7, -3, -2};
        System.out.println("Все нечетные или отрицательные элементы массива 'intArrayToPrint':");
        printOddOrNegativeElements(intArrayToPrint);
        System.out.println();

        System.out.println("Сумма всех элементов массива 'doubleArrayToPrint':");
        System.out.println(arraySum(doubleArrayToPrint));
        System.out.println();

        System.out.println("Произведение всех элементов массива 'doubleArrayToPrint':");
        System.out.println(arrayMultiplication(doubleArrayToPrint));
        System.out.println();

        System.out.println("Квадрат всех элементов массива 'doubleArrayToPrint':");
        printSqr(doubleArrayToPrint);
        System.out.println();

        System.out.println("Куб всех элементов массива 'doubleArrayToPrint':");
        printCube(doubleArrayToPrint);
        System.out.println();
    }

    private static double percentToNumber(double percent) {
        return percent / 100.0;
    }

    private static boolean isPositive(int number) {
        return number > 0;
    }

    private static String numberSignToText(long number) {
        if (number == 0) {
            return "zero";
        }
        return number > 0 ? "positive" : "negative";
    }

    private static String numberSignToTextWithoutCondition(int number) {
        return numberSignToText(number);
    }

    private static void printSequence(int start, int stop) {
        int sign = start - stop < 0 ? -1 : 1;
        while ((start - stop) * sign >= 0 ) {
            System.out.print(start + " ");
            start -= sign;
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printOddOrNegativeElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element % 2 == 1 || element < 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static double arraySum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    private static double arrayMultiplication(double[] array) {
        double multiplication = 1;
        for (double element : array) {
            multiplication *= element;
        }
        return multiplication;
    }

    private static void printSqr(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i] + " ");
        }
        System.out.println();
    }

    private static void printCube(double[] array) {
        for (double element : array) {
            System.out.print(element * element * element + " ");
        }
        System.out.println();
    }
}
