package session.forothersessions.collections.collection.list.impl;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.LinkedList;

public class LinkedListImpl {
    /*
    LinkedList расширяет AbstractSequentialList, реализует List, Queue, Deque
    Является связанным списком
       */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.offer(4);
        linkedList.offerFirst(5);
        linkedList.offerLast(6);
        CollectonUtil.printCollection(linkedList);
    }
}
