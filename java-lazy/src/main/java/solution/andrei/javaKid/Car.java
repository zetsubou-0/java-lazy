package solution.andrei.javaKid;

public class Car {

    public void start() {
        System.out.println("Старт");
    }

    public void stop() {
        System.out.println("Стоп");
    }

    public int drive(int howlong) {
        int distance = howlong * 60;
        return distance;
    }
}
