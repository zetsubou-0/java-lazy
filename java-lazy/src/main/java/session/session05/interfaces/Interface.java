package session.session05.interfaces;

public interface Interface {
   /*
    Интерфейс в Java не является классом. Он представляет собой ряд требований, предъявляемых к классу, который должен соответствовать интерфейсу.
    Общего родительского интерфейса в java нету. Свои иерархии доступны через оператор extends

        Схема интерфейса:
    [public] interface Имя [extends Имя1, Имя2,…, ИмяN] { реализация интерфейса }
        Пример:
    public interface Interface extends Comparable, Serializable{}

    все поля неявно являютя public static final(бщедоступные константы)
    Все методы в интерфейсах(до JDK 8) неявно public, abstract.
    Интерфейс не может содержать статические методы(до JDK8)

    Класс может реализовать любое количество интерфейсов после оператора implements:
        Схема:
    [доступ] class ИмяКласса implements Имя1, Имя2,…, ИмяN { код класса }
        Пример:
    public class ExampleClass implements Interface, Serializable{
        реализация методов
    }
    Класс реализующий интерфейс должен содержать реализацию всех методов либо должен быть объявлен абстрактным

            JDK 8:
    Появилась возможность создавать методы с реализацией с модификатором default. Переопределять в классе не требуется
        default void defaultMethod(){
            System.out.println("Default Method");
        }
    Можно определить статический метод с телом. Для его вызова нужно обращаться через имя интерфейса
        Пример:
    static void staticMethod(){
        System.out.println("Static Method");
    }
        Вызов метода:
    Interface.staticMethod();


    */
    int constantInt = 5; //неявно является public, static, final

    void sayHello(); // неявно является public, abstract

    String getSomeLine();

    //JDK 8
    //default method
    default void defaultMethod(){
        System.out.println("Default Method");
    }

    //static method
    static void staticMethod(){
        System.out.println("Static Method");
    }



}
