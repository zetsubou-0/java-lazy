package session.session04.classesAndObjects;

public class ExampleClass extends SuperClassExample{
//логический блок
    {
        System.out.println("Logic Block");
    }
//статический блок
    static {
        System.out.println("Static Block");
    }
//внутренний класс
    public class Inner{

    }
//вложенный класс
    private static class Nested{

    }
//константа
    public static final String CONSTANT_LINE = setConstantLine();
//поля класса
    public int number;
    protected String line;
    double doubleNumber;
    private String privateLine;
//конструктор
    public ExampleClass(int number, String line, double doubleNumber, String privateLine) {
        System.out.println("Constructor");
        this.number = number;
        this.line = line;
        this.doubleNumber = doubleNumber;
        this.privateLine = privateLine;
    }
//геттеры и сеттеры
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public String getPrivateLine() {
        return privateLine;
    }

    public void setPrivateLine(String privateLine) {
        this.privateLine = privateLine;
    }
//метод
    public void printHello(){
        System.out.println("Hello");
    }

    private static String setConstantLine(){
        System.out.println("CONSTANT_LINE");
        return "CONSTANT_LINE";
    }
}

class SecondClass{

}
class Cat{

}
