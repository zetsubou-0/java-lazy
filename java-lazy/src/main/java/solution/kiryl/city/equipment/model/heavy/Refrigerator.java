package solution.kiryl.city.equipment.model.heavy;

public class Refrigerator extends AbstractHeavyEquipment {

    private final double weight;
    private final int width;
    private final int height;
    private final int length;

    public Refrigerator(int power, int price, double weight, int width, int height, int length) {
        super(power, price);
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", " + super.toString() +
                '}';
    }
}
