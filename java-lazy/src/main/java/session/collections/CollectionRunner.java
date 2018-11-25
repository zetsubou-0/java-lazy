package session.collections;

import java.util.*;

public class CollectionRunner {


    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "qwe";
        array[1] = "asd";
        array[2] = "zxc";
        array[3] = "qqq";
        // добавляем в середину
        array[2] = "www";
        array[3] = "zxc";
        array[4] = "qqq";

        final List<String> arrayList = new ArrayList<>();
        final List<String> linkedList = new LinkedList<>();

//        arrayList.add("qwe");
//        arrayList.add("asd");
//        arrayList.add("zxc");
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//        System.out.println(arrayList.get(3));

//        Cat cat1 = new Cat();
//        cat1.age = 1;
//        Cat cat2 = new Cat();
//        cat2.age = 2;
//        Cat cat3 = new Cat();
//        cat3.age = 3;
//        LinkedCatCollection linkedCatCollection = new LinkedCatCollection();
//        linkedCatCollection.add(cat1);
//        linkedCatCollection.add(cat2);
//        linkedCatCollection.add(cat1);
//        linkedCatCollection.add(cat3);
//        linkedCatCollection.printReverse();

//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100_000; i++) {
//            arrayList.add(0, "" + i);
//        }
//        long end = System.currentTimeMillis();
//        long arrayListTime = end - start;
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < 100_000; i++) {
//            linkedList.add(0, "" + i);
//        }
//        end = System.currentTimeMillis();
//        long linkedListTime = end - start;
//
//        System.out.println(arrayListTime + " vs " + linkedListTime);

        Set<Person> personSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            personSet.add(new Person("Andrei", 30));
            personSet.add(new Person("Kiryl", 30));
        }
        System.out.println(personSet.remove(new Person("Vadim", 30)));
        System.out.println(personSet.remove(new Person("Kiryl", 30)));
        System.out.println(new Person("Kiryl", 30).equals(new Person("Kiryl", 30)));

//        Comparator<Person> personComparator = new PersonComparator();
//        Comparator<Person> personComparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return person2.getName().compareTo(person1.getName());
//            }
//        };
        Set<Person> sortedSet = new TreeSet<>();
        sortedSet.add(new Person("Andrei", 30));
        sortedSet.add(new Person("Vadim", 30));
        sortedSet.add(new Person("Kiryl", 30));
        for (Person person : sortedSet) {
            System.out.println(person);
        }
    }
}
