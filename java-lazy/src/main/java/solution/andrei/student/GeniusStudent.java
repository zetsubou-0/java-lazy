package solution.andrei.student;

// студент гений

public class GeniusStudent extends  Student{

    public GeniusStudent(String surname, String name, String patronymic, int numberLesson) {
        super(surname, name, patronymic, numberLesson);
    }

    public String exam(){
        if (getNumberLesson() > 1) return "экзамен сдал";
        return "экзамен не сдал";
    }
}
