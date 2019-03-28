package solution.kiryl.city.equipment.model.regular;

public class Kettle extends AbstractRegularEquipment {

    private final double volume;

    public Kettle(int power, int price, double volume) {
        super(power, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "volume=" + volume +
                ", " + super.toString() +
                '}';
    }
}
