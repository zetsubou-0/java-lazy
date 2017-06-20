package session.forothersessions.collections.util;

import java.util.Collection;

public class CollectonUtil {
    public static <E> void printCollection(Collection<E> collection){
        for (E element: collection) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
