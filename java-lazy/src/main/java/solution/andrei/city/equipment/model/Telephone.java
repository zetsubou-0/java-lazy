package solution.andrei.city.equipment.model;

public class Telephone extends BaseElectricEquipment {
    private double screenSize;

    public Telephone(int power, double screenSize) {
        super(EquipmentType.PORTABLE, power);
        this.screenSize = screenSize;
    }
}
