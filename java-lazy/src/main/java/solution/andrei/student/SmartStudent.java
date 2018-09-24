package solution.andrei.student;

// умный студент

public class SmartStudent extends Student{

    public SmartStudent(String surname, String name, String patronymic, int numberLesson) {
        super(surname, name, patronymic, numberLesson);
    }

    public String exam(Student a){
        if (getNumberLesson() == lesson/2) return "экзамен сдал";
        else return "экзамен не сдал";
    }

}
