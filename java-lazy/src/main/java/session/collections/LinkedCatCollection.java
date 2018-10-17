package session.collections;

import session.classes.Cat;

public class LinkedCatCollection {

    private NextPrevCat first;
    private NextPrevCat last;

    public void add(Cat cat) {
        if (last == null || first == null) {
            last = new NextPrevCat(cat);
            first = last;
            return;
        }
        NextPrevCat newNextPrevCat = new NextPrevCat(cat);
        last.setNext(newNextPrevCat);
        newNextPrevCat.setPrev(last);
        last = newNextPrevCat;
    }

    public void add(Cat cat, int index) {

    }

    public void printReverse() {
        NextPrevCat nextPrevCat = first;
        while (nextPrevCat != null) {
            System.out.println(nextPrevCat.getCurrent().age);
            nextPrevCat = nextPrevCat.getNext();
        }
    }
}
