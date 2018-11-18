package solution.kiryl.city.equipment.store;

import java.util.Set;

public class Warranty {
    private final int month;
    private final Store original;
    private final Set<Store> centers;

    public Warranty(int month, Store original, Set<Store> centers) {
        this.month = month;
        this.original = original;
        this.centers = centers;
    }

    public int getMonth() {
        return month;
    }

    public Store getOriginal() {
        return original;
    }

    public Set<Store> getCenters() {
        return centers;
    }
}
