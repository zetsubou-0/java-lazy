package solution.andrei.student;

// обычный студент

public class OrdinaryStudent extends Student{

    public OrdinaryStudent(String surname, String name, String patronymic, int numberLesson) {
        super(surname, name, patronymic, numberLesson);
    }

    public String exam(Student a){
        if (getNumberLesson() == lesson || getNumberLesson() == lesson/2) return "экзамен сдал";
        else return "экзамен не сдал";
    }
}
