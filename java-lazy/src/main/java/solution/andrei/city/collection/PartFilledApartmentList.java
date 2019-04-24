package solution.andrei.city.collection;


import solution.andrei.city.house.Apartment;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class PartFilledApartmentList implements List<Apartment> {

    private final int capacity;
    private final double percentFilling;
    private final double numberElementForFilling;
    private final Set<Integer> unavailableIndexes;
    private final Apartment[] array;
    public int size;

    public PartFilledApartmentList(int capasity, double percentFilling) {
        this.capacity = capasity;
        this.percentFilling = percentFilling / 100;
        array = new Apartment[capasity];
        numberElementForFilling = (int)(capasity * this.percentFilling);
        unavailableIndexes = createRandomElement();
    }

    private Set<Integer> createRandomElement() {
        Random random = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        while (true) {
            if (set.size() < numberElementForFilling) {
                set.add(random.nextInt(capacity));
            }
            if (set.size() == numberElementForFilling) return set;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (Object o : array) {
            if (o != null) return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        if (size == 0) return false;
        if (o == null && percentFilling < 1 && percentFilling > 0) return true;
        for (Object apartment : array) {
            if (o == apartment) return true;
        }
        return false;
    }

    @Override
    public Iterator<Apartment> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Apartment apartment) {
        for (int i = 0; i < array.length ; i++) {
            if (unavailableIndexes.contains(i) && array[i] == null) {
                array[i] = apartment;
                size++;
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        PartFilledApartmentList a = new PartFilledApartmentList(10, 67);
        a.add(new Apartment(100, 100));
        a.add(new Apartment(120, 120));
        a.add(new Apartment(130, 130));
        a.add(new Apartment(150, 150));
        a.add(new Apartment(100, 100));
        a.add(new Apartment(120, 120));
        a.add(new Apartment(130, 130));
        a.add(new Apartment(150, 150));
        a.add(new Apartment(100, 100));
        a.add(new Apartment(120, 120));
        a.add(new Apartment(130, 130));
        a.add(new Apartment(150, 150));

        for (int i = 0; i < a.array.length ; i++) {
            System.out.println(a.array[i]);
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Apartment> c) {
        for (Apartment apartment : c) {
            if (!add(apartment)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Apartment> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator<Apartment> operator) {

    }

    @Override
    public void sort(Comparator<? super Apartment> c) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Apartment get(int index) {
        return array[index];
    }

    @Override
    public Apartment set(int index, Apartment element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, Apartment element) {
        if (unavailableIndexes.contains(index) && array[index] == null) {
            array[index] = element;
            size++;
        }
    }

    @Override
    public Apartment remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o == array[i]) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (o == array[i]) return i;
        }
        return -1;
    }

    @Override
    public ListIterator<Apartment> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Apartment> listIterator(int index) {
        return null;
    }

    @Override
    public List<Apartment> subList(int fromIndex, int toIndex) {
        List<Apartment> list = new ArrayList<>();
        for (int i = fromIndex; i < toIndex; i++) {
            list.add(array[i]);
        }
        return list;
    }

    @Override
    public boolean removeIf(Predicate<? super Apartment> filter) {
        return false;
    }

    @Override
    public void forEach(Consumer<? super Apartment> action) {

    }

    @Override
    public Spliterator<Apartment> spliterator() {
        return null;
    }

    @Override
    public Stream<Apartment> stream() {
        return null;
    }

    @Override
    public Stream<Apartment> parallelStream() {
        return null;
    }

    public int getAvailableSize() {
        return 0;
    }

    public int allFilledSize() {
        return 0;
    }

    public boolean addApartment(int index, Apartment apartment) {
        return true;
    }
}
