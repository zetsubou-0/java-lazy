package solution.andrei.city.equipment.model;

public class Telephone extends BaseElectricEquipment {
    private final double screenSize;
    private final int batteryCapacity;
    public Telephone(int power, double screenSize, int batteryCapacity) {
        super(EquipmentType.PORTABLE, power);
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "power=" + getPower() +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                ", price=" + getPrice() +
                '}';
    }
}
