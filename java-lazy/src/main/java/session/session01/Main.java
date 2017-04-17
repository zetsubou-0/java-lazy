package session.session01;

public class Main {

    public static void main(String[] args) {
        // целочисленные
        int x = 1;
        long y = 2; // 2L

        // дробные/ с плавающей запятой
        float a = 3; // 3.0?, 3.0F
        double b = 4; // 4.0

        char c = 'Y';
        char u = '\u2022';
        char bullet = '•';

        byte byteInfo = 0;

        Object obj = "world";
        String str = "Hello ";

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(u);
        System.out.println(bullet);
        System.out.println(byteInfo);
        System.out.println(str + obj + u);
    }
}
