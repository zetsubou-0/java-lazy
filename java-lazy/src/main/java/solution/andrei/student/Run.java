package solution.andrei.student;

public class Run {

    public static void main(String[] args) {

        Student student[] = {
            new OrdinaryStudent("Гончарик", "Вячеслав", "Александрович", 20),
            new OrdinaryStudent("Шах", "Виктор", "Леонидович", 10),
            new OrdinaryStudent("Халаев", "Андрей", "Владимирович", 7),
            new SmartStudent("Кривошеев", "Павел", "Евгеньевич", 8),
            new SmartStudent("Кривошеев", "Андрей", "Евгеньевич", 15),
            new SmartStudent("Серенкова", "Елена", "Алексеевна", 10),
            new GeniusStudent("Корж", "Игорь", "Евгеньевич", 11),
            new GeniusStudent("Коржов", "Роман", "Евгеньевич", 20),
            new GeniusStudent("Хлистунов", "Никлай", "Алексеевна", 2)
        };

        // выводит на экран студентов сдавших экзамен

        for (int i = 0; i < student.length; i++) {
            String result = student[i].exam();
            if (result.equals("экзамен сдал"))
            System.out.println(student[i] + " " + result);
        }
    }
}
