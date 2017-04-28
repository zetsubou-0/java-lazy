package session.session03;

public class Loop {
    /*
    Циклы
    1)while
        while(условие){
            тело цикла;
        }
        пока условие верно(true) выполняется цикл

    2)do - while
        do{
            тело цикла
        }while(условие)
        выполняй цикл, а потом проверяй условие
    3)for
        for(инициализация переменной; условие; итерация){
            тело цикла;
        }

    4)for each
        for(тип переменная(куда сохраняется значение на каждом шаге): коллекция(откуда берётся)){
            тело
        }
    */

    public static void main(String[] args) {
        int a = 5;
        while (a > 0){
            System.out.println("chinko" + a);
            a--;
        }

        int b = -5;
        do {
            System.out.println("chinko" + b);
            b--;
        }while (b > 0);


        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        int c = 5;
        for (; c > 0;) {
            System.out.println(c);
            c--;
        }

        double [] ar = new double[4];

        for (double d: ar) {
            System.out.println(d);
        }
    }

}
