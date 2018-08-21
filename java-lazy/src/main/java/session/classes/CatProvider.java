package session.classes;

public interface CatProvider {
    Cat createCat(boolean chinko, Cat.CatEye leftEye, Cat.CatEye rightEye);

    default Cat getDefaultCat() {
        return new Cat();
    }
}
