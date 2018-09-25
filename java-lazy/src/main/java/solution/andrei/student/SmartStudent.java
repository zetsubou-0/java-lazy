package solution.andrei.student;

// умный студент

public class SmartStudent extends Student{

    public SmartStudent(String surname, String name, String patronymic, int numberLesson) {
        super(surname, name, patronymic, numberLesson);
    }

    public String exam(){
        if (getNumberLesson() == lesson) return "экзамен сдал";
        if (getNumberLesson() == lesson/2) {
            if (0.7 <= Math.random()) return "экзамен сдал";
        }
        return "экзамен не сдал";
    }

}
