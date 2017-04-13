package session02;

public class Cat {
    /**
     * общие
     */
    // public
    // default
    // protected
    // private

    // static
    // final

    /**
     * http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    // все могут ...
    public int age = 5;
    // в пределах пакета
    int legs = 4;
    // в пределах пакета или по цепочке наследования
    protected int eyes = 2;
    // в пределах класса
    private boolean chinko = true;

    public void setChinko(boolean c) {
        chinko = c;
    }

    public boolean hasChinko() {
        return chinko;
    }
}
