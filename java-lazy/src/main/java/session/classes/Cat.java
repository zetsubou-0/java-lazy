package session.classes;

public class Cat {

    public int age = 2;
    String name;
    private boolean chinko;
    protected CatEye catEyeLeft;
    protected CatEye catEyeRight;

    Cat() {
        catEyeLeft = new CatEye("green");
        catEyeRight = new CatEye("blue");
    }

    public String getCatEyeColors() {
        return catEyeLeft.color + " " + catEyeRight.color;
    }

    static final class CatEye {

        private static final String SHAPE = "circle";
        private final String color;

        CatEye(String color) {
            this.color = color;
        }
    }
}
