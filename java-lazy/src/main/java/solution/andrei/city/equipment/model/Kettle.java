package solution.andrei.city.equipment.model;

public class Kettle extends BaseElectricEquipment {
    private int capacity;

    public Kettle(int power, int capacity) {
        super(EquipmentType.REGULAR, power);
        this.capacity = capacity;
    }
}
