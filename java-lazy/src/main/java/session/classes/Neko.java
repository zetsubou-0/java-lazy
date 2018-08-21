package session.classes;

public class Neko {

    public static final String WORD = "nya";
    private final Cat cat;
    private final String address;

    public Neko(Cat cat) {
        address = "qwe";
        this.cat = cat;
    }

    public void sayNya() {
        System.out.println(WORD + " - " + address);
    }
}
