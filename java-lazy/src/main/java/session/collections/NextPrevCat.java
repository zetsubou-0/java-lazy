package session.collections;

import session.classes.Cat;

public class NextPrevCat {
    private final Cat current;
    private NextPrevCat prev;
    private NextPrevCat next;

    public NextPrevCat(Cat cat) {
        current = cat;
    }

    public NextPrevCat getPrev() {
        return prev;
    }

    public void setPrev(NextPrevCat prev) {
        this.prev = prev;
    }

    public NextPrevCat getNext() {
        return next;
    }

    public void setNext(NextPrevCat next) {
        this.next = next;
    }

    public Cat getCurrent() {
        return current;
    }
}
