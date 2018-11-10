package solution.andrei.javaKid;

public class CarOwner {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.stop();
        myCar.start();
        System.out.println(myCar.drive(600));
    }

}
