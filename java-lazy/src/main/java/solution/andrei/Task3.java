package solution.andrei;

//1. Создать метод, который выводит в консоль переданный double в формате "два символа после запятой"(использовать форматирование строки)

public class Task3 {
    public static void main(String[] args) {
        double number = 3.466;
        deduces(number);

        String firstLine = "Валиииик";
        String secondLine = "Валииик";
        comparison(firstLine,secondLine);


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
}