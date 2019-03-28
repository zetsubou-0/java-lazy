package solution.kiryl.city.equipment.model.regular;

public class Toaster extends AbstractRegularEquipment {

    private final int breadCount;

    public Toaster(int power, int price, int breadCount) {
        super(power, price);
        this.breadCount = breadCount;
    }

    public int getBreadCount() {
        return breadCount;
    }

    @Override
    public String toString() {
        return "Toaster{" +
                "breadCount=" + breadCount +
                ", " + super.toString() +
                '}';
    }
}
