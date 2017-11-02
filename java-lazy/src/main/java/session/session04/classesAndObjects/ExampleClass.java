package session.session04.classesAndObjects;

public class ExampleClass extends SuperClassExample{

    {
        System.out.println("Logic Block");
    }

    static {
        System.out.println("Static Block");
    }

    private class Inner{

    }

    private static class Nested{

    }

    public static final String constantLine = setConstantLine();
    public int number;
    protected String line;
    double doubleNumber;
    private String privateLine;

    public ExampleClass(int number, String line, double doubleNumber, String privateLine) {
        System.out.println("Constructor");
        this.number = number;
        this.line = line;
        this.doubleNumber = doubleNumber;
        this.privateLine = privateLine;
    }

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

    public void printHello(){
        System.out.println("Hello");
    }

    private static String setConstantLine(){
        System.out.println("constantLine");
        return "constantLine";
    }
}

class SecondClass{

}
