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

    @Test
    public void shouldCreatePartFilledCollection() {
        checkCollectionCreation(40, 4);
    }

    @Test
    public void shouldCreatePartFilledCollectionWithRoundingDown() {
        checkCollectionCreation(35, 3);
    }

    private void checkCollectionCreation(double percent, int expectedSize) {
        sut = new PartFilledApartmentList(MAX_SIZE, percent);
        assertEquals("При создании коллекции размер должен быть нулевым", 0, sut.size());
        fillWithData();
        checkCollectionSize(expectedSize, sut.size());
        long filledCount = getFilledCount();
        checkCollectionSize(expectedSize, filledCount);
    }

    private void fillWithData() {
        sut.addAll(TEST_APARTMENTS);
    }

    private void checkCollectionSize(int expectedSize, long size) {
        assertEquals("Неверный размер заполненой коллекции. Должен быть: " + expectedSize +
                        ", реальный: " + size
                , expectedSize, size);
    }

    private long getFilledCount() {
        return sut.stream()
                .filter(Objects::nonNull)
                .count();
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
    public void shouldReturnRightEmptyStatus() {
        assertTrue("Коллекция должна быть пустой", sut.isEmpty());
        fillWithData();
        assertFalse("Коллекция должна быть заполнена", sut.isEmpty());
    }

    @Test
    public void shouldFindElement() {
        fillWithData();
        assertTrue("Элемент из заполненйо коллекции должен быть найден", sut.contains(TEST_APARTMENTS.get(5)));
    }

    @Test
    public void shouldNotFindElement() {
        fillWithData();
        assertFalse("Элемент из заполненйо коллекции не должен быть найден, должен отсутствовать в ней", sut.contains(TEST_APARTMENTS.get(6)));
    }

    @Test
    public void shouldFindNullElement() {
        fillWithData();
        assertTrue("Должен найти null элемент в заполненой коллекции", sut.contains(null));
    }

    @Test
    public void shouldNotFindNullInEmptyCollection() {
        assertFalse("Не должен найти null элемент в пустой коллеции", sut.contains(null));
    }

    @Test
    public void shouldReturnIterator() {
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        assertNotNull("Итератор не должен быть null", apartmentIterator);
    }

    @Test
    public void shouldFindNext() {
        fillWithData();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        assertTrue("Должен быть доступен следущий элемент в итераторе", apartmentIterator.hasNext());
    }

    private void createSingleElementCollection() {
        sut = new PartFilledApartmentList(1, FULL_LOAD);
        sut.add(TEST_APARTMENTS.get(0));
    }

    @Test
    public void shouldNotFindNext() {
        createSingleElementCollection();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        if (apartmentIterator.hasNext()) {
            apartmentIterator.next();
            assertFalse("Должен быть не доступен следущий элемент в итераторе", apartmentIterator.hasNext());
            return;
        }
        throw new RuntimeException("Итератор не имеет следущего элемента, хотя должен");
    }

    @Test
    public void shouldGetNextIfPresent() {
        createSingleElementCollection();
        final Iterator<Apartment> apartmentIterator = sut.iterator();
        if (apartmentIterator.hasNext()) {
            assertEquals("Должен быть доступен следущий элемент в итераторе", apartmentIterator.next(), TEST_APARTMENTS.get(0));
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
        assertEquals("Должен удалить элемент из коллекции ", resultList, sut);

    }

    @Test
    public void shouldConvertToObjectsArray() {
        fillWithData();
        final Object[] array = sut.toArray();
        assertEquals("Неверный размер массива", MAX_SIZE, array.length);
        Arrays.stream(array)
                .filter(Objects::nonNull)
                .filter(Apartment.class::isInstance)
                .map(Apartment.class::cast)
                .forEach(val -> assertTrue("Элемент массива должен содержаться в исходной коллекции", TEST_APARTMENTS.contains(val)));
    }

    @Test
    public void shouldConvertToApartmentArray() {
        fillWithData();
        Apartment[] array = new Apartment[MAX_SIZE];
        array = sut.toArray(array);
        assertEquals("Неверный размер массива", MAX_SIZE, array.length);
        Arrays.stream(array)
                .filter(Objects::nonNull)
                .forEach(val -> assertTrue("Элемент массива должен содержаться в исходной коллекции", TEST_APARTMENTS.contains(val)));
    }

    @Test
    public void shouldAddElement() {
        assertTrue("Элемент должен быть добавлен в коллекцию", sut.add(TEST_APARTMENTS.get(0)));
        assertTrue("Элемент должен быть добавлен в коллекцию", sut.contains(TEST_APARTMENTS.get(0)));
    }

    @Test
    public void shouldFindAllElements() {
        fillWithData();
        assertTrue("Должно найти все элементы из заполняемой коллекции, которые влазат в нее", sut.containsAll(EXISTED_APARTMENTS));
    }

    @Test
    public void shouldAddAllElements() {
        assertTrue("Должен добавить все элементы", sut.addAll(EXISTED_APARTMENTS));
        assertTrue("Должен добавить все элементы", sut.containsAll(EXISTED_APARTMENTS));

    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionWhenAddAllElementsFromPosition() {
        sut.addAll(3, TEST_APARTMENTS);
    }

    @Test
    public void shouldRemoveAllFromCollection() {
        fillWithData();
        assertTrue("Должен удалить все данные из набора", sut.removeAll(ImmutableList.of(TEST_APARTMENTS.get(2), TEST_APARTMENTS.get(4))));
        assertTrue("Элемент должен остаться", sut.contains(TEST_APARTMENTS.get(0)));
        assertTrue("Элемент должен остаться", sut.contains(TEST_APARTMENTS.get(1)));
        assertFalse("Элемент должен быть удален", sut.contains(TEST_APARTMENTS.get(2)));
        assertTrue("Элемент должен остаться", sut.contains(TEST_APARTMENTS.get(3)));
        assertFalse("Элемент должен быть удален", sut.contains(TEST_APARTMENTS.get(4)));
        assertTrue("Элемент должен остаться", sut.contains(TEST_APARTMENTS.get(5)));
        assertFalse("Должен не удалить все данные из набора большего чем лист", sut.removeAll(TEST_APARTMENTS));
    }

    @Test
    public void shouldNotRemoveNulls() {
        fillWithData();
        final List<Apartment> oldList = new ArrayList<>(sut);
        assertFalse("Должен не удалить все данные из набора null", sut.removeAll(Collections.singletonList(null)));
        assertEquals("Должен не удалить все данные из набора null, данные не изменились", oldList, sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionWhenRetainAll() {
        sut.retainAll(TEST_APARTMENTS);
    }

    @Test
    public void shouldClearAllData() {
        fillWithData();
        sut.clear();
        assertEquals("Лист должен быть нулевой длинны после удаления", 0, sut.size());
        fillWithData();
        assertEquals("Лист должен быть нулевой длинны после удаления (после добавления)", 0, sut.size());
    }

    @Test
    public void shouldGetElementByIndex() {
        fillWithData();
        sut.get(5);
        sut.get(MAX_SIZE - 1);

        final int testIndex = 4;
        createFullLoadedList();
        fillWithData();
        assertEquals("Должен найти элемент по индексу", TEST_APARTMENTS.get(testIndex), sut.get(testIndex));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionWhenSetElement() {
        fillWithData();
        sut.set(1, TEST_APARTMENTS.get(12));
    }

    @Test
    public void shouldAddElementAtIndex() {
        createFullLoadedList();
        sut.addAll(EXISTED_APARTMENTS);
        final int testIndex = 9;
        final int expectedSize = 7;

        sut.add(testIndex, TEST_APARTMENTS.get(testIndex));
        assertEquals("Должно добавить данные в случайно выбранную свободную ячейку", expectedSize, sut.size());

        sut.add(2, TEST_APARTMENTS.get(12));
        assertEquals("Должно не добавить данные в случайно выбранную занятую ячейку", expectedSize, sut.size());
    }

    @Test
    public void shouldRemoveElement() {
        fillWithData();
        assertTrue("Элемент должен быть удален из коллекции", sut.remove(TEST_APARTMENTS.get(3)));
        assertFalse("Элемент должен быть удален из коллекции", sut.contains(TEST_APARTMENTS.get(3)));
    }

    @Test
    public void shouldGetIndexOf() {
        createFullLoadedList();
        assertEquals("Должно найти индекс элемета", 0, sut.indexOf(null));

        sut.add(TEST_APARTMENTS.get(10));
        sut.add(TEST_APARTMENTS.get(1));
        sut.add(TEST_APARTMENTS.get(2));
        sut.add(TEST_APARTMENTS.get(12));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(3));
        sut.add(TEST_APARTMENTS.get(2));
        assertEquals("Должно найти индекс элемета", 4, sut.indexOf(TEST_APARTMENTS.get(4)));
    }

    @Test
    public void shouldGetLastElementByIndex() {
        createFullLoadedList();
        assertEquals("Должно найти индекс элемета", MAX_SIZE - 1, sut.lastIndexOf(null));

        sut.add(TEST_APARTMENTS.get(10));
        sut.add(TEST_APARTMENTS.get(1));
        sut.add(TEST_APARTMENTS.get(2));
        sut.add(TEST_APARTMENTS.get(12));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(4));
        sut.add(TEST_APARTMENTS.get(2));
        sut.add(TEST_APARTMENTS.get(3));
        assertEquals("Должно найти индекс элемета", 5, sut.lastIndexOf(TEST_APARTMENTS.get(4)));
    }

    // TODO: 2019-04-08 list iterator test
    @Test
    public void shouldFindPrevious() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> apartmentListIterator = sut.listIterator();
        apartmentListIterator.next();
        assertTrue("Должен найти предыдущий элемент", apartmentListIterator.hasPrevious());
    }

    @Test
    public void shouldNotFindPrevious() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> apartmentListIterator = sut.listIterator();
        assertFalse("Должен не найти предыдущий элемент", apartmentListIterator.hasPrevious());
    }

    @Test
    public void shouldShouldGetPrevious() {
        createSingleElementCollection();
        fillWithData();
        final ListIterator<Apartment> apartmentListIterator = sut.listIterator();
        apartmentListIterator.next();
        assertEquals("Должен найти предыдущий элемент", TEST_APARTMENTS.get(0), apartmentListIterator.previous());
    }

    @Test
    public void shouldReturnSublist() {
        assertEquals("Размер саблиста должен совпадать", 5, sut.subList(5, 10).size());

        createFullLoadedList();
        fillWithData();
        assertEquals(
                "Саблисты должны совпадать",
                ImmutableList.of(TEST_APARTMENTS.get(3), TEST_APARTMENTS.get(4), TEST_APARTMENTS.get(5)),
                sut.subList(3, 6));
    }

    @Test
    public void shouldAddApartmentInEmptyPoint() {
        sut = new PartFilledApartmentList(MAX_SIZE, 0);
        assertTrue("Апартаменты должны добавиться если есть свободное место (null)", ((PartFilledApartmentList) sut).addApartment(3, TEST_APARTMENTS.get(3)));
    }

    @Test
    public void shouldNotAddApartmentInFilledPoint() {
        createFullLoadedList();
        fillWithData();
        assertFalse("Апартаменты не должны добавиться если есть нет свободного места (null)", ((PartFilledApartmentList) sut).addApartment(3, TEST_APARTMENTS.get(3)));
    }
}
