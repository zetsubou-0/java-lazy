package session.session05.inheritance.examples;

public class Programmer extends ManWithDegree{
    public String level;

    public Programmer() {
        super();
    }

    public Programmer(String level) {
        this.level = level;
    }

    public Programmer(int certificateNumber, String level) {
        super(certificateNumber);
        this.level = level;
    }

    public Programmer(int weight, int height, int certificateNumber, String level) {
        super(weight, height, certificateNumber);
        this.level = level;
    }

    public void coding(){
        System.out.println("я могу кодить");
    }
}
