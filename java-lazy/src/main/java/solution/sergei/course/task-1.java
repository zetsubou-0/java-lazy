/*

До сдачи задачи необходимо проверить работоспособность программы.
        - код должен компилироваться
        - описанная логика должна выполняться (если необходимо можно проверять путем вывода в консоль или другим удобным способом)

        1. Создать Класс Task01 с методом main (точка входа в программу)

        2. Создать перенные следующих простых типов:
        - byte
        - short
        - int
        - long
        - float
        - double
        - boolean
        - char

        3. Создать переменные одного типа и попробовать положить в него переменные другого типа
        - положить переменные разных типов которые могут "поместиться" друг в друга (не менее 4 разных вариантов)
        - положить переменные разных типов которые не могут "поместиться" друг в друга (не менее 4 разных вариантов)

        4. Создать 2 переменные "сложного/составного" типа (объекты), типов String и Object.

        5. Положить String в переменную типа Object и наоборот

        6. Приведение типов. Все результаты вывести в консоль. Создать переменные следующих типов и произвести действия описанные ниже:
        - переменная типа int -> записать значение суммы символа (типа char) и числа (типа int)
        - переменная типа char -> записать значение суммы символа (типа char) и числа (типа int)
        - переменная типа String -> записать значение суммы чисел типа int "4" и "2" пустой строки
        - переменная типа String -> записать значение суммы пустой строки и чисел типа int "4" и "2"
        - проанализировать результаты

        7. Создать переменную типа double и сохранить в нее сумму переменных всех "простых" типов, кроме boolean

*/


        //1

public class Task01{

    public static void main(String[]args){

        //2

        byte q = 126;
        short w = 32;
        int e = 1;
        long r = 2L;
        float t = 3f; // либо float t = 3.0;
        double y = 4.0;
        boolean u = true;
        char i = 'i';

        //3

        int o = p;
        p = (short) o;





    }
}
