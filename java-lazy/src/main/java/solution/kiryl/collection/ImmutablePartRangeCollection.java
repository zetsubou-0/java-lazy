package solution.kiryl.collection;

import solution.kiryl.city.house.Apartment;

import java.util.*;
import java.util.function.Predicate;

public class ImmutablePartRangeCollection extends ArrayList<Apartment> {

    private int capacity;
    private int notEmptyPart;
    private Set<Integer> notValidIndexes = new HashSet<>();

    public ImmutablePartRangeCollection(int initialCapacity, double percent) throws RangeException {
        super(initialCapacity);
        if (percent > 100 || percent < 0 || initialCapacity <= 0) {
            throw new RangeException(String.format("Wrong parameters. Percent: %s, Capacity: %s", percent, initialCapacity));
        }
        capacity = initialCapacity;
        notEmptyPart = (int) Math.floor(capacity * percent / 100);
        if (notEmptyPart >= capacity) {
            throw new RangeException(String.format("Wrong range. Percent: %s, Capacity: %s", percent, initialCapacity));
        }
        generateNotValidIndexes();
    }

    private void generateNotValidIndexes() {
        final Random random = new Random();
        while (notValidIndexes.size() != capacity - notEmptyPart) {
            int index = random.nextInt(capacity);
            notValidIndexes.add(index);
        }
    }

    @Override
    public boolean add(Apartment apartment) {
        if (size() >= capacity) {
            return false;
        }
        while (size() <= capacity && notValidIndexes.contains(size())) {
            super.add(null);
        }
        if (size() + 1 > capacity) {
            return false;
        }
        super.add(apartment);
        return true;
    }

    @Override
    public void add(int index, Apartment element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Apartment> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends Apartment> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Apartment remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate<? super Apartment> filter) {
        throw new UnsupportedOperationException();
    }
}
