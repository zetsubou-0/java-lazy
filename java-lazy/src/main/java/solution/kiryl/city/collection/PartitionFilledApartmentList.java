package solution.kiryl.city.collection;

import solution.kiryl.city.house.Apartment;

import java.util.*;

public class PartitionFilledApartmentList implements List<Apartment> {

    private static final int UNDEFINED_INDEX = -1;

    private final int maxSize;
    private final double fillPercentage;
    private final int filledSize;
    private final Set<Integer> unavailableIndexes;
    private Apartment[] apartments;
    private int currentIndex;

    public PartitionFilledApartmentList(int maxSize, double fillPercentage) {
        this.currentIndex = -1;
        this.maxSize = maxSize;
        this.fillPercentage = fillPercentage;
        this.filledSize = (int) Math.ceil(Math.round(maxSize * fillPercentage / 100));
        this.apartments = new Apartment[maxSize];
        this.unavailableIndexes = generateUnavailableIndexes();
    }

    private Set<Integer> generateUnavailableIndexes() {
        final Random random = new Random();
        final int unavailableSize = maxSize - filledSize;
        final Set<Integer> unavailable = new HashSet<>(unavailableSize);
        while (unavailable.size() < unavailableSize) {
            unavailable.add(random.nextInt(maxSize));
        }
        return unavailable;
    }

    private boolean isAvailable(int index) {
        return !unavailableIndexes.contains(index) && maxSize > index;
    }

    @Override
    public int size() {
        return currentIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return currentIndex < 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        for (Apartment apartment : apartments) {
            if (o.equals(apartment)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Apartment> iterator() {
        return new ApartmentIterator(this);
    }

    @Override
    public Object[] toArray() {
        return apartments;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a instanceof Apartment[]) {
            return (T[]) apartments;
        }
        throw new IllegalArgumentException("Wrong array type - " + a.getClass() + ", but expected " + Apartment[].class);
    }

    @Override
    public boolean add(Apartment apartment) {
        try {
            int index = getAvailableIndex(currentIndex);
            add(index, apartment);
            currentIndex = index;
        } catch (RangeException e) {
            return false;
        }
        return true;
    }

    private int getAvailableIndex(int index) throws RangeException {
        if (index >= maxSize) {
            throw new RangeException();
        }
        return isAvailable(index + 1)
                ? index + 1
                : getAvailableIndex(index + 1);
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Apartment)) {
            return false;
        }
        for (int i = 0; i < apartments.length;  i++) {
            if (o.equals(apartments[i])) {
                apartments[i] = null;
                unavailableIndexes.add(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean contains = true;
        for (Apartment apartment : apartments) {
            contains &= contains(apartment);
        }
        return contains;
    }

    @Override
    public boolean addAll(Collection<? extends Apartment> collection) {
        boolean success = true;
        for (Apartment apartment : collection) {
            success &= add(apartment);
        }
        return success;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Apartment> c) {
        if (index != currentIndex) {
            throw new UnsupportedOperationException("Could not add");
        }
        boolean success = true;
        for (Apartment apartment : apartments) {
            success &= add(apartment);
        }
        return success;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean success = true;
        for (Object apartment : c) {
            success &= remove(apartment);
        }
        return success;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Retain all is unsupported operation");
    }

    @Override
    public void clear() {
        for (Apartment apartment : apartments) {
            remove(apartment);
        }
    }

    @Override
    public Apartment get(int index) {
        return apartments[index];
    }

    @Override
    public Apartment set(int index, Apartment element) {
        throw new UnsupportedOperationException("Apartment set(int index, Apartment element) is unsupported. Unmodified collection");
    }

    @Override
    public void add(int index, Apartment element) {
        if (!isAvailable(index)) {
            return;
        }
        apartments[index] = element;
    }

    @Override
    public Apartment remove(int index) {
        if (!isAvailable(index)) {
            return null;
        }
        unavailableIndexes.add(index);
        final Apartment oldApartment = apartments[index];
        apartments[index] = null;
        return oldApartment;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < apartments.length; i++) {
            if (o == null && apartments[i] == null || o != null && o.equals(apartments[i])) {
                return i;
            }
        }
        return UNDEFINED_INDEX;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = apartments.length - 1; i >= 0; i--) {
            if (o == null && apartments[i] == null || o != null && o.equals(apartments[i])) {
                return i;
            }
        }
        return UNDEFINED_INDEX;
    }

    @Override
    public ListIterator<Apartment> listIterator() {
        return new ApartmentListIterator(this);
    }

    @Override
    public ListIterator<Apartment> listIterator(int index) {
        return new ApartmentListIterator(this, index);
    }

    @Override
    public List<Apartment> subList(int fromIndex, int toIndex) {
        if (checkListParameters(fromIndex, toIndex)) {
            throw new IllegalArgumentException("Wrong list parameters. Please check those");
        }
        final PartitionFilledApartmentList apartmentList = new PartitionFilledApartmentList(maxSize, fillPercentage);
        System.arraycopy(apartments, 0, apartmentList.apartments, fromIndex, toIndex - fromIndex + 1);
        return apartmentList;
    }

    private boolean checkListParameters(int fromIndex, int toIndex) {
        return fromIndex < toIndex && fromIndex < maxSize;
    }

    public boolean addApartment(int index, Apartment apartment) {
        if (isAvailable(index)) {
            return false;
        }
        unavailableIndexes.remove(index);
        apartments[index] = apartment;
        return true;
    }

    private static class ApartmentIterator implements Iterator<Apartment> {

        private final PartitionFilledApartmentList list;
        private Apartment[] apartments;
        private int currentPosition;

        private ApartmentIterator(PartitionFilledApartmentList list) {
            this.list = list;
            apartments = new Apartment[list.apartments.length];
            System.arraycopy(list.apartments, 0, apartments, 0, list.apartments.length);
        }

        @Override
        public boolean hasNext() {
            return currentPosition < list.apartments.length;
        }

        @Override
        public Apartment next() {
            return apartments[currentPosition++];
        }

        @Override
        public void remove() {
            if (apartments.length == 0 || !list.isAvailable(currentPosition)) {
                next();
                return;
            }
            list.unavailableIndexes.add(currentPosition);
            apartments[currentPosition] = null;
            System.arraycopy(apartments, 0, list.apartments, 0, apartments.length);
            next();
        }
    }

    private static class ApartmentListIterator extends ApartmentIterator implements ListIterator<Apartment> {

        private int lastReturnedIndex = UNDEFINED_INDEX;

        private ApartmentListIterator(PartitionFilledApartmentList list) {
            super(list);
        }

        private ApartmentListIterator(PartitionFilledApartmentList list, int startIndex) {
            this(list);
            super.currentPosition = startIndex;
        }

        @Override
        public boolean hasPrevious() {
            return super.currentPosition < super.list.apartments.length;
        }

        @Override
        public Apartment previous() {
            final Apartment lastReturned = super.apartments[super.currentPosition--];
            lastReturnedIndex = super.currentPosition;
            return lastReturned;
        }

        @Override
        public Apartment next() {
            final Apartment lastReturned = super.next();
            lastReturnedIndex = super.currentPosition;
            return lastReturned;
        }

        @Override
        public int nextIndex() {
            return super.currentPosition + 1;
        }

        @Override
        public int previousIndex() {
            return super.currentPosition - 1;
        }

        @Override
        public void set(Apartment apartment) {
            if (lastReturnedIndex != -1) {
                super.apartments[lastReturnedIndex] = apartment;
                lastReturnedIndex = -1;
            }
        }

        @Override
        public void add(Apartment apartment) {
            throw new UnsupportedOperationException("ListIterator#add operation is unsupported.");
        }
    }
}
