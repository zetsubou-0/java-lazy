package session.session04.modifiers.examples.firstPackage;

public class ExampleModifier {
    public int publicInt;
    protected int protectedInt;
    int packageInt;
    private int privateInt;

    public ExampleModifier(int publicInt, int protectedInt, int packageInt, int privateInt) {
        this.publicInt = publicInt;
        this.protectedInt = protectedInt;
        this.packageInt = packageInt;
        this.privateInt = privateInt;
    }

    public void testPrivateModifier(){
        System.out.println(privateInt);
    }
}
