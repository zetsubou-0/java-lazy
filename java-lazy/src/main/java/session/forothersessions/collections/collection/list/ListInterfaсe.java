package session.forothersessions.collections.collection.list;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaсe {
    /*
    List определяет такое поведение коллекции, которое сохраняет последовательность элементов
    элементы могут быть введены или извлечны по индексу
    расширяет интерфейс Collection

        Методы:

    1) void add(int index, E object); - добавляет заданный объект в лист в позицию указанного индекса. Остальные элементы смещаются
    2) boolean addAll(int index, Collection<? extends E> c); - вводит коллекцию, в позицию заданную по индексу, true - если изменилось
    3) E get(int index);  - возвращает элемент списка по индексу
    4) int indexOf(Object o); - возвращает индекс искомого элемента(первого найденного), или -1 - если отсутсвует
    5) int lastIndexOf(Object o); - возвращает индекс искомого элемента(последнего найденного), или -1 - если отсутсвует
    6) ListIterator<E> listIterator(); - вызывает итератор для обхода элементов с начала вызывающего списка
    7) ListIterator<E> listIterator(int index); - возвращает итератор для обхода элементов начиная с позиции "index"
    8) E remove(int index); - удаляет элемент по индексу и возвращает его;



     */
    public static void main(String[] args) {
        //Создаём список
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        CollectonUtil.printCollection(list);

        //Добавляем элемент по индексу
        list.add(1, 11);
        System.out.println("Список после добавления элемента по индексу: ");
        CollectonUtil.printCollection(list);

        //Добавляем коллекцию по индексу
        List<Integer> listToAdd = new ArrayList<>();
        listToAdd.add(11);
        listToAdd.add(12);
        listToAdd.add(13);
        listToAdd.add(14);
        list.addAll(3, listToAdd);
        System.out.println("Список после добавления коллекции по индексу: ");
        CollectonUtil.printCollection(list);

        //Получаем элемент по индексу
        Integer number = list.get(5);
        System.out.println("Элемент в позици 5: " + number);

        //Поиск индекса элемента
        int firstIndex = list.indexOf(11);
        int lastIndex = list.lastIndexOf(11);
        int indexNotPresence = list.indexOf(20);
        System.out.println("Первый индекс числа 11 в списке: " + firstIndex);
        System.out.println("Последний индекс числа 11 в списке: " + lastIndex);
        System.out.println("Первый индекс числа 20 в списке: " + indexNotPresence);

        //Получаем итератор
        ListIterator<Integer> iterator =list.listIterator();
        ListIterator<Integer> listIteratorByIndex = list.listIterator(list.size()-1);
        System.out.println("Печатаем список через листИтератор:");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nПечатаем список в обратном порядке с помощью листИтератора:");
        while (listIteratorByIndex.hasPrevious()){
            System.out.print(listIteratorByIndex.previous() + " ");
        }

        //Удаляем элемент по индексу
        list.remove(0); //удаляем первый элемент
        System.out.println("\nПечатаем список после удаления элемента:");
        CollectonUtil.printCollection(list);
    }
}
