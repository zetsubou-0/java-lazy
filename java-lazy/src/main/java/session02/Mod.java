package session02;

public class Mod {

    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.age);
        System.out.println(cat.legs);
        System.out.println(cat.eyes);
        System.out.println(cat.hasChinko());
        cat.setChinko(false);
        boolean chinko = cat.hasChinko();
        System.out.println(chinko);
    }
}
