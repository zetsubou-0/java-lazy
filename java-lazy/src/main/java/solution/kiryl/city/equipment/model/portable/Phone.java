package solution.kiryl.city.equipment.model.portable;

public class Phone extends AbstractPortableEquipment {

    private final double screenSize;

    public Phone(int power, int price, double screenSize) {
        super(power, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", " + super.toString() +
                '}';
    }
}
