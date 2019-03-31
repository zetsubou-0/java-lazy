package solution.andrei.city.equipment.model;

public class TV extends BaseElectricEquipment {
    private final int resolutionWidth;
    private final int resolutionHeight;
    public TV(int power, int resolutionWidth, int resolutionHeight) {
        super(EquipmentType.HEAVY, power);
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
    }

    @Override
    public String toString() {
        return "TV{" +
                "power=" + getPower() +
                ", resolutionWidth=" + resolutionWidth +
                ", resolutionHeight=" + resolutionHeight +
                ", price=" + getPrice() +
                '}';
    }
}
