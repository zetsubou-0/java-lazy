package solution.andrei;

//1. Создать метод, который выводит в консоль переданный double в формате "два символа после запятой"(использовать форматирование строки)

public class Task3 {
    public static void main(String[] args) {
        //1
        double number = 3.466;
        deduces(number);
        //2
        String firstLine = "Валиииик";
        String secondLine = "Валииик";
        comparison(firstLine,secondLine);
        //3
        int SecondNumber = 0;
        defineNumber(SecondNumber);
        //4
        square ();
        //5
        int[] element = new int[5];
        element[0] = 10;
        element[1] = 5;
        element[2] = 9;
        element[3] = 4;
        element[4] = 7;
        numbersDecrease(element);
        //6
        ethnicity();
        //7
        int firstNumber = 10;
        int secondNumber = 9;
        int thirdNumber = 5;
        mean(firstNumber,secondNumber,thirdNumber);


    }
    //1. Создать метод, который выводит в консоль переданный double в формате "два символа после запятой"(использовать форматирование строки)
    private static void deduces(double a) {
        System.out.printf("%.2f%n%n", a);
    }
    /*2. Создать метод, принимающий в качестве параметров две строки и выводящее в консоль
    "Строки идентичны" если они одинаковые,
    "Длины строк равны" если равны длины,
    "Совпадает первый символ" если первая буква строк одинаковая,
    иначе "Строки разные"*/

    private static void comparison(String firstline,String secondline){
        if(firstline.equals(secondline)){
            System.out.printf("%s%n%n","Строки идентичны");
        } else {
            System.out.printf("%s%n%n","Строки разные");
        }
        if (firstline.length() == secondline.length()) {
            System.out.printf("%s%n%n","Длины строк равны");
        }
        if (firstline.charAt(0) == secondline.charAt(0)){
            System.out.printf("%s%n%n","Совпадает первый символ");
        }
    }

    /*3. Создать метод, принимающий в качестве параметра целое число
    Вывести на экран его строку-описание следующего вида:
    «отрицательное четное число» - если число отрицательное и четное,
    «отрицательное нечетное число» - если число отрицательное и нечетное,
    «нулевое число» - если число равно 0,
    «положительное четное число» - если число положительное и четное,
    «положительное нечетное число» - если число положительное и нечетное.
    Пример для числа 100:
    положительное четное число
    Пример для числа -51:
    отрицательное нечетное число */

    private static void defineNumber (int number){
        if (number < 0 && number % 2 == 0){
            System.out.printf("%s%n%n","отрицательное четное число");
        }else if (number < 0 && number % 2 == -1){
            System.out.printf("%s%n%n","отрицательное нечетное число");
        }else if (number > 0 && number % 2 == 0){
            System.out.printf("%s%n%n","положительное четное число");
        }else if (number > 0 && number % 2 == 1){
            System.out.printf("%s%n%n","положительное нечетное число");
        }else{
            System.out.printf("%s%n%n","нулевое число");
        }
    }
    //4. Создать метод выводящий на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.

    private static void square (){
        int i = 0;
        while (i <=9){
            int j = 0;
            while (j <=9){
                System.out.print("S");
                j++;
            }
          System.out.println();
            i++;
        }
        System.out.println();
    }
    //5. Создать метод, принимающий в качестве параметров 5 чисел и выводящий их в порядк убывания
    private static void numbersDecrease(int[] a){
        for (int i = a.length-1; i > 0;i--){
            for (int j = 0; j < i; j++){
                if (a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i <  a.length; i++) {
            System.out.print(a[i] + "  ");
        }

    }
    //6. Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.(лучше в отдельном методе реализовывать)

    private static void ethnicity(){
        for (int i = 0; i <= 100  ; i++){
            if (i != 0 && i % 2 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
     //7. Создать метод, принимающий в качестве параметров 3 целых числа и выводящее в консоль среднее из них

    private static void mean (int a, int b, int c){
        if (a > b && b < c){
            System.out.println(b);
        }else if (b > a && a < c){
            System.out.println(a);
        }else if (b > c && c < a){
            System.out.println(c);
        }
    }
}