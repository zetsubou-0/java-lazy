package session.session03;

public class Types {
    public static void main(String[] args) {
      /*
        1) логический boolean true, false Размер не определён
        2) числовые
        2.1) символьный char Пример: 'r' '\u2022' 65 ( Размер 2 байта)
        2.2) целочисленные типы
            -byte Размер 1 байт -128 до 127 2^8
            -short Размер 2 байта 2^16
            -int Размер 4 байта 2^32
            -long Разме 8 байт
        2.3) с плавающей точкой(вещественные):
            -float Размер 4 байта 42.16321313f или 42.16F
            -double Размер 8 байт 42.163518818181

*/

        char a = '\u2022';
        char b = '•';
        char c = 65;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println((char)67);
        System.out.println((char)(c + 2));
        boolean bool = true;
        boolean bool1 = false;
        System.out.println(bool);
        System.out.println(bool1);
        byte b1 = 125;
        System.out.println(b1);
        System.out.println((byte) 128);
        int i = 25789;
        long l = 25789L;
        System.out.println(i);
        System.out.println(l);
    //    int i1 = 10L;   - ошибка компиляции
        int i1 = (int) 10L;
        long l1 = 10;
        double d = 3.14;
        float f = 3.14f;
    }
}
