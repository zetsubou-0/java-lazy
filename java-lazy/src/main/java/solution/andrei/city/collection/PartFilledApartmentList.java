package solution.andrei.city.collection;


import solution.andrei.city.house.Apartment;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class PartFilledApartmentList implements List<Apartment> {

    private final int capasity;
    private final double percentFilling;
    private final double NUMBER_ELEMENT_FOR_FILLING;
    private final Apartment[] ARRAY;
    public int size;

    public PartFilledApartmentList(int capasity, double percentFilling) {
        this.capasity = capasity;
        this.percentFilling = percentFilling / 100;
        ARRAY = new Apartment[capasity];
        NUMBER_ELEMENT_FOR_FILLING = capasity * percentFilling;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return true;
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
        if (size == NUMBER_ELEMENT_FOR_FILLING) {
            return false;
        }
        for (int i = (int)(Math.random() * capasity); i < ARRAY.length; i++) {
            if (ARRAY[i] == null && size < NUMBER_ELEMENT_FOR_FILLING) {
                ARRAY[i] = apartment;
                size++;
                return true;
            }
        }
        return false;
    }












    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Apartment> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Apartment> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
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
        return null;
    }

    @Override
    public Apartment set(int index, Apartment element) {
        return null;
    }

    @Override
    public void add(int index, Apartment element) {

    }

    @Override
    public Apartment remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
        return null;
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
