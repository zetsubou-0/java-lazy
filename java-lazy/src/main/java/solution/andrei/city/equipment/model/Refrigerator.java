package solution.andrei.city.equipment.model;

public class Refrigerator extends BaseElectricEquipment {
    private final int width, height, length;
    public Refrigerator(int power, int widht, int height, int length) {
        super(EquipmentType.HEAVY, power);
        this.width = widht;
        this.height = height;
        this.length = length;
    }
}
