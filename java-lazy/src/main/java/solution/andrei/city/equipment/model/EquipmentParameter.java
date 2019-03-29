package solution.andrei.city.equipment.model;

public class EquipmentParameter {
    private final EquipmentType type;
    private final int power;
    int width;
    int height;
    int length;
    double weight;
    double screenSize;
    int capacity;

    EquipmentParameter(EquipmentType type, int power) {
        this.type = type;
        this.power = power;
    }

}
