package main.java.session02;

public class Main {

    public static void main(String[] args) {
        int x; // не инициализированная переменная
        int y = 1;
        x = 2;

        boolean variableTrue = true;
        boolean variableFalse = false;

        // литералы
        String str = "qwe";
        int q = 1;

        String str2 = str;
        String str3 = str + str2;

        boolean b1 = variableTrue && variableTrue;  // && - логическое и - истина, если все истина
        boolean b2 = variableTrue || variableFalse;  // || - логическое или - истина, если хотя бы одно истина
        boolean b3 = !variableTrue;  // ! - логическое не - инверсия
    }
}
