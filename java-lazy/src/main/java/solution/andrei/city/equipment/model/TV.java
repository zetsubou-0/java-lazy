package solution.andrei.city.equipment.model;

public class TV extends BaseElectricEquipment {
    private final int resolutionOnWidth;
    private final int resolutionOnHeight;
    public TV(int power, int resolutionOnWidth, int resolutionOnHeight) {
        super(EquipmentType.HEAVY, power);
        this.resolutionOnWidth = resolutionOnWidth;
        this.resolutionOnHeight = resolutionOnHeight;
    }
}
