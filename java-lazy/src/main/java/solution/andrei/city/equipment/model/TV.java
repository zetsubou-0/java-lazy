package solution.andrei.city.equipment.model;

public class TV extends BaseHeaveElectricEquipment {
    private final int resolutionWidth;
    private final int resolutionHeight;
    public TV(int power, int resolutionWidth, int resolutionHeight) {
        super(power);
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
