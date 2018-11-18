package solution.kiryl.city.house.builder;

import solution.kiryl.city.house.Apartment;
import solution.kiryl.collection.ImmutablePartRangeCollection;
import solution.kiryl.collection.RangeException;

import java.util.Collection;
import java.util.Random;

public class House {
    private final int maxPower;
    private Collection<Apartment> apartments;

    House(int maxPower, int count, int percent) throws RangeException {
        this.maxPower = maxPower;
        fillApartment(count, percent);
    }

    private void fillApartment(int count, int percent) throws RangeException {
        apartments = new ImmutablePartRangeCollection(count, percent);
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            apartments.add(new Apartment(random.nextInt(4500) + 500, maxPower));
        }
    }
}
