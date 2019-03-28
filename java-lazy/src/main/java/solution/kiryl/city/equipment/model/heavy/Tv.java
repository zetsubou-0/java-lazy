package solution.kiryl.city.equipment.model.heavy;

import solution.kiryl.city.equipment.model.util.MatrixType;

public class Tv extends AbstractHeavyEquipment {

    private final double screenSize;
    private final MatrixType matrixType;

    public Tv(int power, int price, double screenSize, MatrixType matrixType) {
        super(power, price);
        this.screenSize = screenSize;
        this.matrixType = matrixType;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "screenSize=" + screenSize +
                ", matrixType=" + matrixType +
                ", " + super.toString() +
                '}';
    }
}
