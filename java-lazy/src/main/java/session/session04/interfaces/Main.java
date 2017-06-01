package session.session04.interfaces;

public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        //вызов переопределённых методов
        exampleClass.sayHello();
        System.out.println(exampleClass.getSomeLine());
        //вызов default метода
        exampleClass.defaultMethod();
        //вызов статического метода интерфейса
        Interface.staticMethod();
    }
}
