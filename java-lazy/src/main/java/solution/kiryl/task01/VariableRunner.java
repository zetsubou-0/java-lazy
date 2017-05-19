package solution.kiryl.task01;

/**
 * Created by kiryl.lutsyk on 19/05/17.
 */
public class VariableRunner {

    /* 1. - класс с методом main */
    public static void main(String[] args) {
        /* 2. - создание переменных */
        int intVar = 1;
        long longVar = 2L;
        float floatVar = 3.0F;
        double doubleVar = 4.0;
        boolean boleanVar = true;
        char charVar;
        String stringVar = null;
        charVar = 'X';
        stringVar = "Hello neko";

        /* 3. - создание переменных и приведение типов */
        int intVar2 = 1;
        intVar2 = (int) 2L;
        intVar2 = (int) 3.0F;
        intVar2 = (int) 4.0;

        long longVar2 = 1;
        longVar2 = 2L;
        longVar2 = (long) 3.0F;
        longVar2 = (long) 4.0;

        float floatVar2 = 1;
        floatVar2 = 2L;
        floatVar2 = 3.0F;
        floatVar2 = (float) 4.0;

        double doubleVar2 = 1;
        doubleVar2 = 2L;
        doubleVar2 = 3.0F;
        doubleVar2 = 4.0;
    }
}
