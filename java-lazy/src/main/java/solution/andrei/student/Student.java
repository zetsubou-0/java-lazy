package solution.andrei.student;

public abstract class Student {
    private String surname;
    private String name;
    private String patronymic;
    final int lesson = 20;
    private int numberLesson;

    protected Student(String surname, String name, String patronymic, int numberLesson) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.numberLesson = numberLesson;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getNumberLesson() {
        return numberLesson;
    }

    public abstract String exam(Student a);

    public String toString() {
        return getSurname() + " " + getName() + " " + getPatronymic() + " " + getNumberLesson();
    }
}
