package session.forothersessions.collections.collection.queue.impl;

import session.forothersessions.collections.comparator.IntegerComparator;
import session.forothersessions.collections.util.CollectonUtil;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
    /*
    PriorityQueue расширяет AbstractQueue и реализует Queue
    PriorityQueue - очередь по приоритетам на основании компаратора
        Конструкторы:
    PriorityQueue()
    PriorityQueue(int initialCapacity) - по умолчанию ёмкость - 11
    PriorityQueue(int initialCapacity, Comparator<? extends E> comparator)
    PriorityQueue(Collection<? extends E> c)
    PriorityQueue(PriorityQueue<? extends E> c)
    PriorityQueue(SortedSet<e> ss)
    */
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new IntegerComparator());
        priorityQueue.offer(6);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        CollectonUtil.printCollection(priorityQueue);

        Integer num;
        while ((num = priorityQueue.poll()) != null){
            System.out.print(num + " ");
        }

    }
}
