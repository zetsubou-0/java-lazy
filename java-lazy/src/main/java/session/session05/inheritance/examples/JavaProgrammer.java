package session.session05.inheritance.examples;

public class JavaProgrammer extends Programmer{
    public JavaProgrammer() {
    }

    public JavaProgrammer(String level) {
        super(level);
    }

    public JavaProgrammer(int certificateNumber, String level) {
        super(certificateNumber, level);
    }

    public JavaProgrammer(int weight, int height, int certificateNumber, String level) {
        super(weight, height, certificateNumber, level);
    }

    @Override
    public void coding() {
        System.out.println("я могу кодить на Java");
    }
}
