package solution.andrei;

//1. Создать метод, который выводит в консоль переданный double в формате "два символа после запятой"(использовать форматирование строки)

public class Task3 {
    public static void main(String[] args) {
        double number = 3.466;
        deduces(number);

        String firstLine = "Валиииик";
        String secondLine = "Кииряяя";
        comparison(firstLine,secondLine);
    }
    //1. Создать метод, который выводит в консоль переданный double в формате "два символа после запятой"(использовать форматирование строки)
    private static void deduces(double a) {
        System.out.printf("%.2f%n", a);
    }
    /*2. Создать метод, принимающий в качестве параметров две строки и выводящее в консоль
    "Строки идентичны" если они одинаковые,
    "Длины строк равны" если равны длины,
    "Совпадает первый символ" если первая буква строк одинаковая,
    иначе "Строки разные"*/

    private static void comparison(String firstline,String secondline){
        if(firstline == secondline){
            System.out.println("Строки идентичны");
        }else if (firstline.length() == secondline.length()){
            System.out.println("Длины строк равны");
            if (firstline.indexOf(firstline) == secondline.indexOf(secondline)){
                System.out.println("Совпадает первый символ");
            }
        }else {
            System.out.println("Строки разные");
        }

    }

}