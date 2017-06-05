package session.session04.inheritance.examples;

public class Man {
    public int weight;
    public int height;

    public Man(){
        super();
    }

    public Man(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void eat(){
        System.out.println("Я могу есть");
    }
}
