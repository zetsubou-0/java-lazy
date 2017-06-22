package session.forothersessions.collections.collection.list.impl;

import java.util.ArrayList;

public class ArrayListImps {
 /*
    ArrayList расширяет AbstractList и реализует интерфейс List
    ArrayList - списочный массив объектных ссылок переменной длинны
    Размер ArrayList может динамически увеличиваться и уменьшаться
        Возможные конструкторы:
    ArrayList<>(); - пустой
    ArrayList<>(Collection<? extends E> c); - заполнит списочный массив коллекцией
    ArrayList<>(int initialCapacity); - списочный массив заданной ёмкости(базовый размер)

        Увеличить базовую емкость можно:
    void ensureCapacity(int minCapacity)
        Уменьшить
    void trimToSize()






 */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
        ArrayList<Integer> arrayList3 = new ArrayList<>(20);
    }
}
