package session.forothersessions.collections.collection;

import session.forothersessions.collections.util.CollectonUtil;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    /*
    Методы интерфейса Collection:
    1) int size(); - возвращает количество элементов, содержащихся в коллекции
    2) boolean isEmpty() - возвращает true, если коллекция пуста, иначе false
    3) boolean contains(Object object) - возвращает true, если object является элементом коллекции, иначе false
    4) Object[] toArray(); - возвращает массив, содержащий все элементы коллекции
    5) <T> T[] toArray(T[] array); - как прошлый, но заполняется переданный массив, если массив > коллекции - заполняется null
                                    если массив < коллекции, то создаётся и возвращается новый массив
    6) boolean add(E объект); - вводит заданный элемент в коллекцию, если добавлен, то true, если объект уже присутствовал во множестве, то false
    7) boolean remove(Object o); - удаляет объект o из коллекции, если успешно, то true, иначе false
    8) boolean containsAll(Collection<?> c); true, если вызывающая коллекция содержит все элементы заданной коллекции "c", иначе false
    9) boolean addAll(Collection<? extends E> c); - добавляет все элементы коллекции "c" в вызывающую коллекцию, true, если успешно все добавлены
    10)boolean removeAll(Collection<?> c); - удаляет все элементы коллекции "c" из вызывающей коллекцию, true, если успешно удалены
    11)boolean retainAll(Collection<?> c); - удаляет из вызывающей коллекции все элементы, кроме элементов заданной коллекции "c", true, если удачно
    12)void clear(); - удаляет все элементы из вызывающей коллекции
    13)boolean equals(Object o); - true, если вызывающая коллекция и заданный объект равнозначны
    14)int hashCode(); - возвращает хэш-код вызывающей коллекции
    */

    public static void main(String[] args) {
        //Создание коллекции
        Collection<Integer> collection = new ArrayList<>();

        //Добавление элементов
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(9);
        collection.add(10);
        CollectonUtil.printCollection(collection);

        //Получаем количество элементов
        System.out.println("Количество элементов в коллекции: " + collection.size());

        //Проверяем пустая ли коллекция
        System.out.println("Проверка на пустую коллекцию: " + collection.isEmpty());

        //Проверяем на содержание элемента
        System.out.println("Содержит ли коллекция цифру 5: " + collection.contains(5));
        System.out.println("Содержит ли коллекция цифру 11: " + collection.contains(11));

        //Получаем массив из коллекции
        Object[] objects = collection.toArray();
        System.out.println("Массив полученный из метода toArray()");
        printArray(objects);
        Integer[] integers = new Integer[13];
        integers = collection.toArray(integers);
        System.out.println("Массив полученный из метода toArray(T[] array)");
        printArray(integers);

        //Удаляем элемент
        Integer integerToRemove = 5;
        boolean isRemoved = collection.remove(integerToRemove);
        System.out.println("Успешность удаления: " + isRemoved);
        System.out.println("Коллекция после удаления");
        CollectonUtil.printCollection(collection);

        //Проверяем на сожержание коллекции
        Collection<Integer> collectionToCompare = new ArrayList<>();
        collectionToCompare.add(1);
        collectionToCompare.add(2);
        boolean containsAll = collection.containsAll(collectionToCompare);
        System.out.println("Содержит ли collection всю collectionToCompare? : " + containsAll);

        //удаляем все элементы, которые содержатся в коллекции
        isRemoved = collection.removeAll(collectionToCompare);
        System.out.println("Удалились ли элементы: " + isRemoved);
        System.out.println("Коллекция после удаления");
        CollectonUtil.printCollection(collection);

        //Удаление кробе коллекции
        Collection<Integer> retainCollection = new ArrayList<>();
        retainCollection.add(3);
        retainCollection.add(4);
        retainCollection.add(10);
        isRemoved = collection.retainAll(retainCollection);
        System.out.println("Удалились ли элементы: " + isRemoved);
        System.out.println("Коллекция после удаления");
        CollectonUtil.printCollection(collection);

        //Сравнение коллекций
        boolean isEquals = collection.equals(retainCollection);
        System.out.println("Идентичны ли коллекции collection и retainCollection: " + isEquals);

        //Получение хэш-кода коллекции
        System.out.println("Хэш-код коллекции: " + collection.hashCode());

        //Очистка поллекции
        collection.clear();
        System.out.println("Коллекция после очистки");
        CollectonUtil.printCollection(collection);
    }

    private static <E> void printArray(E[] array){
        for (E element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


}
