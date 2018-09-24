package solution.andrei.student;

public class Run {

    public static void main(String[] args) {

        Student student[] = new Student[9];
        student[0] = new OrdinaryStudent("Гончарик", "Вячеслав", "Александрович", 20);
        student[1] = new OrdinaryStudent("Шах", "Виктор", "Леонидович", 10);
        student[2] = new OrdinaryStudent("Халаев", "Андрей", "Владимирович", 7);
        student[3] = new SmartStudent("Кривошеев", "Павел", "Евгеньевич", 8);
        student[4] = new SmartStudent("Кривошеев", "Андрей", "Евгеньевич", 15);
        student[5] = new SmartStudent("Серенкова", "Елена", "Алексеевна", 10);
        student[6] = new GeniusStudent("Корж", "Игорь", "Евгеньевич", 11);
        student[7] = new GeniusStudent("Коржов", "Роман", "Евгеньевич", 20);
        student[8] = new GeniusStudent("Хлистунов", "Никлай", "Алексеевна", 2);

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i] + " " + student[i].exam(student[i]));
        }


    }
}
