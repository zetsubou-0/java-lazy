package session.session04.modifiers.examples.firstPackage;

public class TestModifierInPackage {
    public static void main(String[] args) {
        ExampleModifier exampleModifier = new ExampleModifier(1, 2, 3, 4);
        System.out.println(exampleModifier.publicInt);
        System.out.println(exampleModifier.protectedInt);
        System.out.println(exampleModifier.packageInt);
        //System.out.println(exampleModifier.privateInt); - переменная не видна, т.к имеет приватный уровень доступа
    }
}
