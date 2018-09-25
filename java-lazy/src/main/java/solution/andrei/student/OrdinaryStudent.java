package solution.andrei.student;

// обычный студент

public class OrdinaryStudent extends Student{

    public OrdinaryStudent(String surname, String name, String patronymic, int numberLesson) {
        super(surname, name, patronymic, numberLesson);
    }

    public String exam(){
        if (getNumberLesson() == lesson) return "экзамен сдал";
        if (getNumberLesson() == lesson/2) {
            if (0.5 <= Math.random()) return "экзамен сдал";
        }
        return "экзамен не сдал";
    }
}
