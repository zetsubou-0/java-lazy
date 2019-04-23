package solution.kiryl.city;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import solution.kiryl.city.collection.PartFilledApartmentList;
import solution.kiryl.city.house.Apartment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class PartFilledApartmentListTest {

    // collection with 15 elements
    private static final List<Apartment> TEST_APARTMENTS = IntStream.range(1, 16)
            .mapToObj(val -> new Apartment(val, val))
            .collect(Collectors.toList());
    private static final List<Apartment> EXISTED_APARTMENTS = TEST_APARTMENTS.subList(0, 6);
    private static final int MAX_SIZE = 10;
    public static final int FULL_LOAD = 100;

    private List<Apartment> sut = Collections.emptyList();

    @Before
    public void init() {
        sut = new PartFilledApartmentList(MAX_SIZE, 67);
    }

    private void createFullLoadedList() {
        sut = new PartFilledApartmentList(MAX_SIZE, FULL_LOAD);
    }

    private void checkCollectionCreation(double percent, int expectedSize) {
        sut = new PartFilledApartmentList(MAX_SIZE, percent);
        assertEquals(0, sut.size());
        fillWithData();
        checkCollectionSize(expectedSize, sut.size());
    }

    private void fillWithData() {
        TEST_APARTMENTS.forEach(sut::add);
    }

    private void checkCollectionSize(int expectedSize, long size) {
        assertEquals(expectedSize, size);
    }

    private long getFilledCount() {
        return sut.stream()
                .filter(Objects::nonNull)
                .count();
    }

    private void createSingleElementCollection() {
        sut = new PartFilledApartmentList(1, FULL_LOAD);
        sut.add(TEST_APARTMENTS.get(0));
    }

    @Test
    public void shouldAddElement() {
        assertTrue(sut.add(TEST_APARTMENTS.get(0)));
    }

    @Test
    public void shouldNotAddElement() {
        createSingleElementCollection();
        sut.add(TEST_APARTMENTS.get(0));
        assertFalse(sut.add(TEST_APARTMENTS.get(1)));
    }

    @Test
    public void shouldReturnCorrectSize() {
        checkCollectionSize(0, sut.size());

        IntStream.range(0, 3).forEach(index -> sut.add(TEST_APARTMENTS.get(index)));
        checkCollectionSize(3, sut.size());

        fillWithData();
        checkCollectionSize(6, sut.size());
    }

    @Test
    public void shouldFindElement() {
        fillWithData();
        assertTrue(sut.contains(TEST_APARTMENTS.get(5)));
    }

    @Test
    public void shouldNotFindElement() {
        fillWithData();
        assertFalse(sut.contains(TEST_APARTMENTS.get(6)));
    }

    @Test
    public void shouldFindNullElementInPartFilledCollection() {
        fillWithData();
        assertTrue(sut.contains(null));
    }

    @Test
    public void shouldNotFindNullInEmptyCollection() {
        assertFalse(sut.contains(null));
    }

    @Test
    public void shouldNotFindNullInFullCollection() {
        createFullLoadedList();
        fillWithData();
        assertFalse(sut.contains(null));
    }

    @Test
    public void shouldFindAllElements() {
        fillWithData();
        assertTrue(sut.containsAll(EXISTED_APARTMENTS));
    }

    @Test
    public void shouldNotFindNullCollectionInEmptyCollection() {
        assertFalse(sut.containsAll(Collections.singletonList(null)));
    }

    @Test
    public void shouldFindNullInNotEmptyCollection() {
        fillWithData();
        assertTrue(sut.containsAll(Collections.singletonList(null)));
    }

    @Test
    public void shouldGetElementByIndex() {
        fillWithData();
        sut.get(5);
        sut.get(MAX_SIZE - 1);

        final int testIndex = 4;
        createFullLoadedList();
        fillWithData();
        assertEquals(TEST_APARTMENTS.get(testIndex), sut.get(testIndex));
    }

    @Test
    public void shouldReturnRightEmptyStatus() {
        assertTrue(sut.isEmpty());
        fillWithData();
        assertFalse(sut.isEmpty());
    }

    @Test
    public void shouldCreatePartFilledCollection() {
        checkCollectionCreation(40, 4);
    }

    @Test
    public void shouldCreatePartFilledCollectionWithRoundingDown() {
        checkCollectionCreation(35, 3);
    }

    @Test
    public void shouldAddElementAtIndex() {
        createFullLoadedList();
        final int testIndex = 9;
        final int expectedSize = 1;

        sut.add(testIndex, TEST_APARTMENTS.get(testIndex));
        assertEquals(expectedSize, sut.size());
        assertEquals(TEST_APARTMENTS.get(testIndex), sut.get(testIndex));
    }

    @Test
    public void shouldAddAllElements() {
        assertTrue(sut.addAll(EXISTED_APARTMENTS));
        assertTrue(sut.containsAll(EXISTED_APARTMENTS));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionWhenRetainAll() {
        sut.retainAll(TEST_APARTMENTS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldNotAddApartmentsWithShift() {
        sut.add(TEST_APARTMENTS.get(0));
        sut.add(TEST_APARTMENTS.get(1));
        sut.add(TEST_APARTMENTS.get(2));
        sut.addAll(1, TEST_APARTMENTS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionWhenSetElement() {
        fillWithData();
        sut.set(1, TEST_APARTMENTS.get(12));
    }

    @Test
    public void shouldGetIndexOf() {
        createFullLoadedList();
        assertEquals(0, sut.indexOf(null));

        sut.add(TEST_APARTMENTS.get(10));
        sut.add(TEST_APARTMENTS.get(1));
        sut.add(TEST_APARTMENTS.get(2));
        sut.add(TEST_APARTMENTS.get(12));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(3));
        sut.add(TEST_APARTMENTS.get(2));
        assertEquals(4, sut.indexOf(TEST_APARTMENTS.get(4)));
    }

    @Test
    public void shouldGetLastElementByIndex() {
        createFullLoadedList();
        assertEquals(MAX_SIZE - 1, sut.lastIndexOf(null));

        sut.add(TEST_APARTMENTS.get(10));
        sut.add(TEST_APARTMENTS.get(1));
        sut.add(TEST_APARTMENTS.get(2));
        sut.add(TEST_APARTMENTS.get(12));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(2));
        sut.add(TEST_APARTMENTS.get(3));
        assertEquals(5, sut.lastIndexOf(TEST_APARTMENTS.get(4)));
    }

    @Test
    public void shouldReturnSublist() {
        assertEquals(5, sut.subList(5, 10).size());

        createFullLoadedList();
        fillWithData();
        assertEquals(ImmutableList.of(TEST_APARTMENTS.get(3), TEST_APARTMENTS.get(4), TEST_APARTMENTS.get(5)), sut.subList(3, 6));
    }

    @Test
    public void shouldGetStringViewAsArrayList() {
        createFullLoadedList();
        fillWithData();
        assertEquals(TEST_APARTMENTS.subList(0, MAX_SIZE).toString(), sut.toString());
    }

    @Test
    public void shouldRemoveElement() {
        fillWithData();
        assertTrue(sut.remove(TEST_APARTMENTS.get(3)));
        assertFalse(sut.contains(TEST_APARTMENTS.get(3)));
    }

    @Test
    public void shouldNotRemoveNullElement() {
        fillWithData();
        assertFalse(sut.remove(null));
    }

    @Test
    public void shouldRemoveElementByIndex() {
        createFullLoadedList();
        fillWithData();
        assertEquals(TEST_APARTMENTS.get(3), sut.remove(3));
        assertFalse(sut.contains(TEST_APARTMENTS.get(3)));
    }

    @Test
    public void shouldRemoveNotRemoveNullElementByIndex() {
        createFullLoadedList();
        assertNull(sut.remove(3));
    }

    @Test
    public void shouldConvertToObjectsArray() {
        fillWithData();
        final Object[] array = sut.toArray();
        assertEquals(MAX_SIZE, array.length);
        Arrays.stream(array)
                .filter(Objects::nonNull)
                .filter(Apartment.class::isInstance)
                .map(Apartment.class::cast)
                .forEach(val -> assertTrue(TEST_APARTMENTS.contains(val)));
    }

    @Test
    public void shouldConvertToApartmentArray() {
        fillWithData();
        Apartment[] array = new Apartment[MAX_SIZE];
        array = sut.toArray(array);
        assertEquals(MAX_SIZE, array.length);
        Arrays.stream(array)
                .filter(Objects::nonNull)
                .forEach(val -> assertTrue(TEST_APARTMENTS.contains(val)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfUnsupportedType() {
        fillWithData();
        String[] array = new String[MAX_SIZE];
        sut.toArray(array);
    }

    @Test
    public void shouldAddApartmentInEmptyPoint() {
        assertTrue(((PartFilledApartmentList) sut).addApartment(3, TEST_APARTMENTS.get(3)));
    }

    @Test
    public void shouldNotAddApartmentInFilledPoint() {
        createFullLoadedList();
        fillWithData();
        assertFalse(((PartFilledApartmentList) sut).addApartment(3, TEST_APARTMENTS.get(3)));
    }

    @Test
    public void shouldReturnCorrectRealSize() {
        checkCollectionSize(MAX_SIZE, ((PartFilledApartmentList) sut).getAvailableSize());

        fillWithData();
        checkCollectionSize(MAX_SIZE, ((PartFilledApartmentList) sut).getAvailableSize());
    }

    @Test
    public void shouldReturnRealFilledSize() {
        checkCollectionSize(0, ((PartFilledApartmentList) sut).allFilledSize());

        fillWithData();
        checkCollectionSize(MAX_SIZE, ((PartFilledApartmentList) sut).allFilledSize());
    }

    @Test
    public void shouldReturnIterator() {
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        assertNotNull(apartmentIterator);
    }

    @Test
    public void shouldFindNext() {
        fillWithData();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        assertTrue(apartmentIterator.hasNext());
    }

    @Test
    public void shouldNotFindNext() {
        createSingleElementCollection();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        if (apartmentIterator.hasNext()) {
            apartmentIterator.next();
            assertFalse(apartmentIterator.hasNext());
            return;
        }
        throw new RuntimeException("Итератор не имеет следущего элемента, хотя должен");
    }

    @Test
    public void shouldGetNextIfPresent() {
        createSingleElementCollection();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        if (apartmentIterator.hasNext()) {
            assertEquals(apartmentIterator.next(), TEST_APARTMENTS.get(0));
            return;
        }
        throw new RuntimeException("Итератор не имеет следущего элемента, хотя должен");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldNotGetNextElementIfAbsent() {
        createSingleElementCollection();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        if (apartmentIterator.hasNext()) {
            apartmentIterator.next();
            apartmentIterator.next();
            return;
        }
        throw new RuntimeException("Итератор не имеет следущего элемента, хотя должен");
    }

    @Test
    public void shouldReturnListIterator() {
        final ListIterator<Apartment> apartmentIterator = sut.listIterator();
        assertNotNull(apartmentIterator);
    }

    @Test
    public void shouldReturnListIteratorStartedWithIndex() {
        fillWithData();
        final ListIterator<Apartment> apartmentIterator = sut.listIterator(3);
        assertNotNull(apartmentIterator);
    }

    @Test
    public void shouldFindPrevious() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> apartmentListIterator = sut.listIterator();
        apartmentListIterator.next();
        assertTrue(apartmentListIterator.hasPrevious());
    }

    @Test
    public void shouldNotFindPrevious() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> apartmentListIterator = sut.listIterator();
        assertFalse(apartmentListIterator.hasPrevious());
    }

    @Test
    public void shouldGetPrevious() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> apartmentListIterator = sut.listIterator();
        apartmentListIterator.next();
        assertEquals(TEST_APARTMENTS.get(0), apartmentListIterator.previous());
    }

    @Test
    public void shouldReturnNextIndex() {
        createSingleElementCollection();
        fillWithData();
        assertEquals(1, sut.listIterator().nextIndex());
    }

    @Test
    public void shouldNotReturnNextIndex() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> listIterator = sut.listIterator();
        listIterator.next();
        assertEquals(-1, listIterator.nextIndex());
    }

    @Test
    public void shouldReturnPreviousIndex() {
        createFullLoadedList();
        fillWithData();
        final ListIterator<Apartment> listIterator = sut.listIterator();
        listIterator.next();
        assertEquals(0, listIterator.previousIndex());
    }

    @Test
    public void shouldNotReturnPreviousIndex() {
        createFullLoadedList();
        fillWithData();
        final ListIterator<Apartment> listIterator = sut.listIterator();
        assertEquals(-1, listIterator.previousIndex());
    }

    @Test
    public void shouldRemoveElementFromCollectionViaIterator() {
        createFullLoadedList();
        fillWithData();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        int index = 0;
        while (apartmentIterator.hasNext()) {
            if (index++ == 4) {
                apartmentIterator.remove();
                break;
            }
            apartmentIterator.next();
        }
        final List<Apartment> resultList = new ArrayList<>(TEST_APARTMENTS.subList(0, MAX_SIZE));
        resultList.set(4, null);
        assertEquals(resultList, sut);

    }

    @Test
    public void shouldRemoveAllFromCollection() {
        fillWithData();
        assertTrue(sut.removeAll(ImmutableList.of(TEST_APARTMENTS.get(2), TEST_APARTMENTS.get(4))));
        assertTrue(sut.contains(TEST_APARTMENTS.get(0)));
        assertTrue(sut.contains(TEST_APARTMENTS.get(1)));
        assertFalse(sut.contains(TEST_APARTMENTS.get(2)));
        assertTrue(sut.contains(TEST_APARTMENTS.get(3)));
        assertFalse(sut.contains(TEST_APARTMENTS.get(4)));
        assertTrue(sut.contains(TEST_APARTMENTS.get(5)));
        assertFalse(sut.removeAll(TEST_APARTMENTS));
    }

    @Test
    public void shouldRemoveAllIfNullExistsInInputFromCollection() {
        fillWithData();
        List<Apartment> listForRemove = new ArrayList<>(4);
        listForRemove.add(TEST_APARTMENTS.get(2));
        listForRemove.add(null);
        listForRemove.add(TEST_APARTMENTS.get(4));
        listForRemove.add(null);
        assertTrue(sut.removeAll(listForRemove));
        assertTrue(sut.contains(TEST_APARTMENTS.get(0)));
        assertTrue(sut.contains(TEST_APARTMENTS.get(1)));
        assertFalse(sut.contains(TEST_APARTMENTS.get(2)));
        assertTrue(sut.contains(TEST_APARTMENTS.get(3)));
        assertFalse(sut.contains(TEST_APARTMENTS.get(4)));
        assertTrue(sut.contains(TEST_APARTMENTS.get(5)));
        assertFalse(sut.removeAll(TEST_APARTMENTS));
    }

    @Test
    public void shouldNotRemoveIfOnlyNulls() {
        fillWithData();
        final List<Apartment> oldList = new ArrayList<>(sut);
        assertFalse(sut.removeAll(Collections.singletonList(null)));
        assertEquals(oldList, sut);
    }

    @Test
    public void shouldClearAllData() {
        fillWithData();
        sut.clear();
        assertEquals(0, sut.size());
        fillWithData();
        assertEquals(0, sut.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionOnListIteratorAdd() {
        sut.listIterator().add(TEST_APARTMENTS.get(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionOnListIteratorSet() {
        sut.listIterator().set(TEST_APARTMENTS.get(0));
    }
}
