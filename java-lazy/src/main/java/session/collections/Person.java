package session.collections;

public class Person implements Comparable<Person> {
    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", age: " + age + "\n";
    }

    @Override
    public boolean equals(Object pers) {
        if (this == pers) {
            return true;
        }
        if (pers == null || getClass() != pers.getClass()) return false;

        final Person person = (Person) pers;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        return result;
        return 44;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}
