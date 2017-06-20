package session.forothersessions.collections.collection.set;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {
/*
        NavigableSet расширяет SortedSet. Извлечение элементов из коллекции осуществляется на основании наиболее точного
         совпадения с заданным значением.
        Методы:
    1) E lower(E object) - возратит наименьший элемент, по критерию e < object. null - если не найден
    2) E floor(E object) - возратит наибольший элемент, по критерию e <= object. null - если не найден
    3) E ceiling(E object) - возратит наименьший элемент, по критерию e >= object. null - если не найден
    4) E higher(E object) - возратит наибольший элемент, по критерию e > object. null - если не найден
    5) E pollFirst(E object) - возратит первый(наименьший) элемент удаляя его из множества. null - если множество пустое.
    6) E pollLast(E object) - возратит последний(наибольший) элемент удаляя его из множества. null - если множество пустое.
    7) E pollLast(E object) - возратит последний(наибольший) элемент удаляя его из множества. null - если множество пустое.
    8) NavigableSet<E> descendingSet() - возратит множество обратное по отношению к вызывающему.
    9) NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) - возвращает
            подмножество от fromElement до toElement, определяя включать ли элемент в множество(fromInclusive и toInclusive)
    10) NavigableSet<E> headSet(E toElement, boolean toInclusive) - возратит подмножество элементов меньших чем toElement
            toInclusive - включительно или нет
    11) NavigableSet<E> tailSet(E fromElement, boolean fromInclusive) - возратит подмножество элементов больших чем fromElement
            fromInclusive - включительно или нет
    12) Iterator<E> descendingIterator() - возвращает итератор, выполняющий обход от большего к меньшему элементу
*/

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(3);
        navigableSet.add(9);
        navigableSet.add(4);
        navigableSet.add(15);
        navigableSet.add(39);
        navigableSet.add(20);
        navigableSet.add(1);
        navigableSet.add(99);
        navigableSet.add(83);
        navigableSet.add(115);
        CollectonUtil.printCollection(navigableSet);

        //Получение элементов множества
        System.out.println("lower 83 : " + navigableSet.lower(83));
        System.out.println("higher 83 : " + navigableSet.higher(83));
        System.out.println("floor 83 : " + navigableSet.floor(83));
        System.out.println("ceiling 83 : " + navigableSet.ceiling(83));

        //Получение и попутное удаление элементов:
        System.out.println("С помощью метода pollFirst() удалили и получили элемент: " + navigableSet.pollFirst());
        System.out.println("С помощью метода pollLast() удалили и получили элемент: " + navigableSet.pollLast());
        System.out.println("Текущее состояние коллекции:");
        CollectonUtil.printCollection(navigableSet);

        //Получаем обратную коллекция
        System.out.println("Получаем обратную коллекцию:");
        CollectonUtil.printCollection(navigableSet.descendingSet());

        //Получаем подмножества
        NavigableSet<Integer> subSet = navigableSet.subSet(4, true, 83, false);
        System.out.println("Получаем подмножество методом subSet:");
        CollectonUtil.printCollection(subSet);

        NavigableSet<Integer> headSet = navigableSet.headSet(39, true);
        System.out.println("Получаем подмножество методом headSet:");
        CollectonUtil.printCollection(headSet);

        NavigableSet<Integer> tailSet = navigableSet.tailSet(9, false);
        System.out.println("Получаем подмножество методом tailSet:");
        CollectonUtil.printCollection(tailSet);

        //Получаем итератор
        Iterator<Integer> descendingIterator = navigableSet.descendingIterator();
        System.out.println("Печатаем элементы с помощью descendingIterator:");
        while (descendingIterator.hasNext()){
            System.out.print(descendingIterator.next() + " ");
        }
    }
}
