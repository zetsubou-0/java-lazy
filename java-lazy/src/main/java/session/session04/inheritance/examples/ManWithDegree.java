package session.session04.inheritance.examples;

public class ManWithDegree extends Man{
    public int certificateNumber;

    public ManWithDegree() {
        super();
    }

    public ManWithDegree(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public ManWithDegree(int weight, int height, int certificateNumber) {
        super(weight, height);
        this.certificateNumber = certificateNumber;
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public void study(){
        System.out.println("я могу учиться");
    }
}
