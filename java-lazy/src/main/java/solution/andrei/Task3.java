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
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки разные");
        }
        if (firstline.length() == secondline.length()) {
            System.out.println("Длины строк равны");
        }
        if (firstline.charAt(0) == secondline.charAt(0)){
            System.out.println("Совпадает первый символ");
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
            System.out.println("отрицательное четное число");
        }else if (number < 0 && number % 2 == -1){
            System.out.println("отрицательное нечетное число");
        }else if (number > 0 && number % 2 == 0){
            System.out.println("положительное четное число");
        }else if (number > 0 && number % 2 == 1){
            System.out.println("положительное нечетное число");
        }else{
            System.out.println("нулевое число");
        }
    }
}