package session.session04.modifiers.examples.secondPackage;

import session.session04.modifiers.examples.firstPackage.ExampleModifier;

public class TestModifierInOtherPackage {
    public static void main(String[] args) {
        ExampleModifier exampleModifier = new ExampleModifier(1, 2, 3, 4);
        System.out.println(exampleModifier.publicInt);
        //System.out.println(exampleModifier.protectedInt); - переменная не видна, т.к имеет protected уровень доступа
        //System.out.println(exampleModifier.packageInt); - переменная не видна, т.к имеет default(package-private) уровень доступа
        //System.out.println(exampleModifier.privateInt); - переменная не видна, т.к имеет private уровень доступа
    }
}
