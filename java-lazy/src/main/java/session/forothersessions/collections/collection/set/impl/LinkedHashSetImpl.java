package session.forothersessions.collections.collection.set.impl;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl {
    /*
    LinkedHashSet реализует HashSet
    Поддерживает связанный список - при переборе элементов, будут извлекаться в порядке добавления
    */
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        CollectonUtil.printCollection(linkedHashSet);
    }
}
