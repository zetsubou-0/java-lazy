package session.session04.modifiers.examples.secondPackage;

import session.session04.modifiers.examples.firstPackage.ExampleModifier;

public class TestModifierExtendedInOtherPackage extends ExampleModifier{
    public TestModifierExtendedInOtherPackage(int publicInt, int protectedInt, int packageInt, int privateInt) {
        super(publicInt, protectedInt, packageInt, privateInt);
    }
    public void testModifiers(){
        System.out.println(publicInt);
        System.out.println(protectedInt); //  можно обратиться к переменной, т.к TestModifierExtendedInOtherPackage унаследован от ExampleModifier
    }

    public static void main(String[] args) {
        ExampleModifier exampleModifier = new ExampleModifier(1, 2, 3, 4);
        System.out.println(exampleModifier.publicInt);
        //System.out.println(exampleModifier.protectedInt); - переменная не видна, т.к имеет protected уровень доступа
        //System.out.println(exampleModifier.packageInt); - переменная не видна, т.к имеет default(package-private) уровень доступа
        //System.out.println(exampleModifier.privateInt); - переменная не видна, т.к имеет private уровень доступа
    }
}
