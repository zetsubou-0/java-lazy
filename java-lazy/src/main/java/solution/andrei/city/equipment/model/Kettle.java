package solution.andrei.city.equipment.model;

public class Kettle extends BaseRegularElectricEquipment {
    private final double capacity;
    public Kettle(int power, double capacity) {
        super(power);
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
