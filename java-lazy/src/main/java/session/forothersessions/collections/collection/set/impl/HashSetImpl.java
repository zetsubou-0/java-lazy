package session.forothersessions.collections.collection.set.impl;


import java.util.HashSet;

public class HashSetImpl {
    /*
    HashSet расширяет  AbstractSet и реализует Set
    используется для создания коллекции, для хранения элементов которой используется хэш-таблица.
    Механизм хэширования: определяется хеш-код - однозначное значение содержимого ключа. Хэш-код служит далее в качестве индекса

    Преимущество HashSet - постоянство времени выполнения методов add(), contains(), remove(), size()
        Конструкторы:
    HashSet();
    HashSet(Collection<? extends E> c);
    HashSet(int initialCapacity); - ёмкость хеш- множества(по умолчанию 16)
    HashSet(int initialCapacity, float loadFactor);  - loadFactor - определяет на сколько должно быть заполнено хеш-множество
                                                      прежде, чем будет изменён его размер(по умолчанию 0.75f) от 0.0 до 1.0

    хеш-множество не гарантирует упорядоченности элементов

    */
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(16, 0.75f);
    }
}
