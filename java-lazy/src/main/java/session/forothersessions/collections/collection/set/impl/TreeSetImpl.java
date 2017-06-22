package session.forothersessions.collections.collection.set.impl;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {
    /*
    TreeSet расширяет AbstractSet и реализует NavigableSet
    Для хранения применяется древовидная структура
    Элементы сохраняются в отсортированном порядке по нарастающей
        Конструкторы:
    TreeSet();
    TreeSet(Collection<? extends E> c);
    TreeSet(Comparator<? super E> comparator);
    TreeSet(SortedSet<E> ss);
    */

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(3);
        CollectonUtil.printCollection(treeSet);
    }
}
