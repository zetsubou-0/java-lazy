package solution.andrei;

//1. Создать метод, который выводит в консоль переданный double в формате "два символа после запятой"(использовать форматирование строки)

public class Task3 {
    public static void main(String[] args) {
        double number = 3.466;
        deduces(number);
    }

    public static void deduces(double a) {
        System.out.printf("%.2f%n", a);
    }
}