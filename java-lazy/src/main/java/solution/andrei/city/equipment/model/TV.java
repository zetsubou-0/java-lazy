package solution.andrei.city.equipment.model;

public class TV extends BaseElectricEquipment {
    public TV(int power, int width, int height, int length, double weight) {
        super(EquipmentType.HEAVY, power);
    }
}
