package session.forothersessions.collections.collection.queue;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeInteface {
    /*
    Deque расширяет Queue
    Deque - двусторонняя очередь. Совмещает FIFO и FILO
        Методы
    1) void addFirst(E object) вводит заанный объект в голову очереди. Если нет места в очереди фиксированной длинны - IllegalStateException
    2) void addLast(E object) вводит заанный объект в хвост очереди. Если нет места в очереди фиксированной длинны - IllegalStateException
    3) Iterator<E> descendingIterator() - возвращает итератор, для обхода с хвоста к голове
    4) E getFirst() возвращает первый элемент. Если пуста - NoSuchElementException
    5) E getLast() возвращает последний элемент. Если пуста - NoSuchElementException
    6) boolean offerFirst() - пытается ввести элемент в голову очереди, если получилось - true, нет - false
    7) boolean offerLast() - пытается ввести элемент в хвост очереди, если получилось - true, нет - false
    8) E peekFirst() - возвращает элемент из головы очереди, если она пуста, возвращает null
    9) E peekLast() - возвращает элемент из хвоста очереди, если она пуста, возвращает null
    10) E pollFirst() - возвращает элемент из головы очереди удаляя её, null, если пуста
    11) E pollLast() - возвращает элемент из хвоста очереди удаляя её, null, если пуста
    12) E pop() - возвращает элемент из головы очереди удаляя её, если пуста бросается NoSuchElementException
    13) void push(E object) - вводит заанный объект в голову очереди. Если нет места в очереди фиксированной длинны - IllegalStateException
    14) E removeFirst() - возвращает элемент из головы очереди удаляя её, если пуста бросается NoSuchElementException
    15) E removeLast() - возвращает элемент из хвоста очереди удаляя её, если пуста бросается NoSuchElementException
    16) boolean removeFirstOccurrence(Object o) - удаляет первый экземпляр заданного объекта из очереди. true - удачно. false - элемент отсутствует
    17) boolean removeLastOccurrence(Object o) - удаляет последний экземпляр заданного объекта из очереди. true - удачно. false - элемент отсутствует
    */
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        //добавляем элементы
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);
        deque.push(9);
        CollectonUtil.printCollection(deque);

        //Получаем нисходящий итератор
        Iterator<Integer> iterator = deque.descendingIterator();
        System.out.println("Проходимся по очереди с помощью descendingIterator: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //Получаем первый и последний элементы
        System.out.println("Головной элемент getFirst(): " + deque.getFirst());
        System.out.println("Последний элемент методом getLast(): " + deque.getLast());
        System.out.println("Головной элемент методом peekFirst(): " + deque.peekFirst());
        System.out.println("Последний элемент методом peekLast(): " + deque.peekLast());

        //Вводим элементы с помощью offer
        System.out.println("Вводим элемент в головной конец " + deque.offerFirst(10));
        System.out.println("Вводим элемент в хвостовой конец " + deque.offerLast(11));
        CollectonUtil.printCollection(deque);

        //Получение элемента с удалением
        System.out.println("Удаляем элемент из головного конца методом pollFirst():" + deque.pollFirst());
        System.out.println("Удаляем элемент из хвостового конца методом pollLast():" + deque.pollFirst());
        System.out.println("Удаляем элемент из головного конца методом pop():" + deque.pop());
        System.out.println("Удаляем элемент из головного конца методом removeFirst():" + deque.removeFirst());
        System.out.println("Удаляем элемент из головного конца методом removeLast():" + deque.removeLast());
        CollectonUtil.printCollection(deque);

        //Удаляем элементы
        System.out.println("Удаляем элемент из головного конца методом removeFirstOccurrence:" + deque.removeFirstOccurrence(1));
        System.out.println("Удаляем элемент из головного конца методом removeLastOccurrence:" + deque.removeFirstOccurrence(5));
        CollectonUtil.printCollection(deque);


    }
}
