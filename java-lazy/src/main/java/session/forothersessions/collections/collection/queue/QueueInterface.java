package session.forothersessions.collections.collection.queue;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
        /*
        Queue расширяет интерфейс Collection.
         Queue - определяет поведение очереди, Принцип FIFO(First In, First Out) первым пришёл, первым вышел
            Методы:
        1) E element() - возвращает элемент из головы очереди. Элемент не удаляется. Если очередь пуста, то бросается NoSuchElementException
        2) boolean offer(E object) - пытается ввести объект в очередь,true - успешно, false - нет
        3) E peek() - возвращает элемент из головы очереди, если она пуста, возвращает null
        4) E poll() - возвращает элемент из головы очереди удаляя её, null, если пуста
        5) E remove() -возвращает элемент из головы очереди удаляя её, если пуста бросается NoSuchElementException

         */
        public static void main(String[] args) {
            Queue<Integer> queue = new PriorityQueue<>();//очередь упорядочена
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.offer(7);
            queue.offer(1);
            queue.offer(3);
            queue.offer(9);
            CollectonUtil.printCollection(queue);
            System.out.println(queue.element());
            System.out.println(queue.peek());
            System.out.println(queue.remove());
            System.out.println(queue.poll());
            CollectonUtil.printCollection(queue);
        }
}
