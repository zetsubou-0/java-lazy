package solution.andrei.city.equipment.model;

public class TV extends BaseElectricEquipment {
    private int width;
    private int height;
    private int length;
    private double weight;

    public TV(int power, int width, int height, int length, double weight) {
        super(EquipmentType.HEAVY, power);
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }
}
