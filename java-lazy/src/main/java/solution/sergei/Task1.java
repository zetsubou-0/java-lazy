package solution.sergei;

/**
 * Created by Carser on 24.12.2017
 1. Создать любой класс с методом main

 2. В этом методе создать переменные следующих типов:
 int, long, float, double, boolean, char, String. При чем переменная типа double должна быть инициализированна значением 0б в последствии присвоено значени;
 а переменная типа String инициализированна null, в последствии задано значение; переменная типа char объявлена без инициализации, в последствии задано значение.

 3. Создать другие переменные типов int, long, float, double, при чем в каждую необходимо сохранить по несколько значений разных типов (int, long, float, double соотвтетственно).
 К примеру:
 long myVar = 4;
 myVar = 5L;
 */
public class Task1 {
    public static void main() {
        int a;
        a = 50;

        long b;
        b = 14L;                        //исправленно

        float c;
        c = 3.14f;

        double d = 0.0;                 //исправленно
        d = 13.1;                       // -//-

        boolean e;
        e = true;                       //добавленно

        char f;
        f = 'f';

        String g = null;
        g = "Task 1";

     /*   int a1 = 0;
        long b1;
        b1 = (long) a1;
        float c1;
        c1 = (float) a1;
        double d1;
        d1 = (double) a1;

        long b2 = 14L;
        int a2;
        a2 = (int) b2;
        float c2;
        c2 = (long) b2;
        double d2;
        d2 = (double) b2;

        float c3 = 3.01f;
        int a3;
        a3 = (int) c3;
        long b3;
        b3 = (long) c3;
        double d3 = 1.2;
        d3 = (double) c3;

        double d4 = 5.7;
        int a4;
        a4 = (int) d4;
        long b4;
        b4 = (long) d4;
        float c4;
        c4 = (float) d4;    */

         int a1 = 0;
         long b1 = a1;
         float c1 = a1;
         double d1 = a1;

         long b2 = 14L;
         int a2 = (int) b2;
         float c2 = b2;
         double d2 = b2;

         float c3 = 3.01f;
         int a3 = (int) c3;
         long b3 = (long) c3;
         double d3 = c3;

         double d4 = 5.7;
         int a4 = (int) d4;
         long b4 = (long) d4;
         float c4 = (float) d4;


    }
}
