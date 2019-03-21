package session.base;

public class Session3 {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 3);
        Animal animal2 = new Cat();
        Animal animal3 = new Animal(2);

        System.out.println(animal);
        System.out.println();
        System.out.println(animal2);
        System.out.println();
        System.out.println(animal3);
        System.out.println();
    }
}

class Animal {

    final int age;
    final String name;

    private Animal() {
        this("default name", -1);
        System.out.println("Animal() - " + this);
    }

    public Animal(int age) {
        this("default name", age);
        System.out.println("Animal(int age) - " + this);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal(String name, int age) - " + this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {

    final String tail;
    final int age;

    Cat() {
        super("default name", -2);
        System.out.println("Super:Cat()" + this);
        age = 5;
        tail = "tail";
        System.out.println("Cat()" + this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", tail='" + tail + '\'' +
                '}';
    }
}