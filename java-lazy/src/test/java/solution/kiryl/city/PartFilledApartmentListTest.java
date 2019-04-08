package solution.kiryl.city;

import org.junit.Before;
import org.junit.Test;
import solution.kiryl.city.collection.PartFilledApartmentList;
import solution.kiryl.city.house.Apartment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class PartFilledApartmentListTest {

    // collection with 15 elements
    private static final List<Apartment> TEST_APARTMENTS = IntStream.range(1, 16)
            .mapToObj(val -> new Apartment(val, val))
            .collect(Collectors.toList());
    private static final List<Apartment> EXISTED_APARTMENTS = TEST_APARTMENTS.subList(0, 6);
//    private static final Apartment[] EXISTED_APARTMENTS_AS_OBJECT = EXISTED_APARTMENTS;
    private static final int MAX_SIZE = 10;

    private List<Apartment> sut = Collections.emptyList();

    @Before
    public void init() {
        sut = new PartFilledApartmentList(MAX_SIZE, 60);
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

    // TODO: 2019-04-08 iterator tests

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
    public void shouldRemoveElement() {
        fillWithData();
        assertTrue("Элемент должен быть удален из коллекции", sut.remove(TEST_APARTMENTS.get(3)));
        assertFalse("Элемент должен быть удален из коллекции", sut.contains(TEST_APARTMENTS.get(3)));
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
}
