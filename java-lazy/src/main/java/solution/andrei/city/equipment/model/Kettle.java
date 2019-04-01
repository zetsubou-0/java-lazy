package solution.andrei.city.equipment.model;

public class Kettle extends BaseElectricEquipment {
    private final double capacity;
    public Kettle(int power, double capacity) {
        super(EquipmentType.REGULAR, power);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "power=" + getPower() +
                ", capacity=" + capacity +
                ", price=" + getPrice() +
                '}';
    }
}
