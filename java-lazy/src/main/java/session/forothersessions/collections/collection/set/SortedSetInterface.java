package session.forothersessions.collections.collection.set;

import session.forothersessions.collections.util.CollectonUtil;
import session.forothersessions.collections.collection.set.comparator.IntegerComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    /*
    SortedSet расширяет Set. Опеределяет поведене множеств, отсортированных в порядке возрастания.
        Методы:
    1)Comparator<? extends E> comparator(); - возвращает компаратор, отсортированного множества. Если компаратора нету, то null;
    2)SortedSet<E> subSet(E fromElement, E toElement) - возвращает отсортированное множество с позиции fromElement, до позиции toElement-1.
            ССылки на элементы сохраняются
    3)SortedSet<E> headSet(E toElement) - возвращае отсортированное множество до позиции toElement-1.
    4)SortedSet<E> tailSet(E fromElement) - возвращает отсортированное множество c позиции fromElement.
    5)E first() - возвращает первый элемент отсортированного множества
    6)E last() - возвращает последний элемент отсортированного множества


    */
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(new IntegerComparator()); // можно без компаратора
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(8);
        sortedSet.add(7);
        sortedSet.add(9);
        sortedSet.add(9);
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(6);
        CollectonUtil.printCollection(sortedSet);
        // Получаем компаратор если он есть
        System.out.println("Получаем и печатаем компаратор: ");
        System.out.println(sortedSet.comparator());

        // Полуучаем подмножество разными способами и печатаем
        SortedSet<Integer> subSet = sortedSet.subSet(2,6);
        System.out.println("Используем метод subSet:");
        CollectonUtil.printCollection(subSet);

        SortedSet<Integer> headSet = sortedSet.headSet(6);
        System.out.println("Используем метод headSet:");
        CollectonUtil.printCollection(headSet);

        SortedSet<Integer> tailSet = sortedSet.tailSet(2);
        System.out.println("Используем метод tailSet:");
        CollectonUtil.printCollection(tailSet);

        //Получаем и печатаем первый и последний элемент
        System.out.println("Первый элемент: " + sortedSet.first());
        System.out.println("Последний элемент: " + sortedSet.last());
    }

}
