package session.classes;

public class Human {
    public int age;
    public static int averageAge = 99;

    @Override
    public String toString() {
        return "Age: " + age + ", Average age: " + averageAge;
    }
}
