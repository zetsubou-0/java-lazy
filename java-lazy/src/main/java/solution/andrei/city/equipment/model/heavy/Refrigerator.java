package solution.andrei.city.equipment.model.heavy;

public class Refrigerator extends BaseHeaveElectricEquipment {
    private final int width, height, length;
    public Refrigerator(int power, int widht, int height, int length) {
        super(power);
        this.width = widht;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power=" + getPower() +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", price=" + getPrice() +
                '}';
    }
}
