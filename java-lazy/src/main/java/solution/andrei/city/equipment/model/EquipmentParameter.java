package solution.andrei.city.equipment.model;

public class EquipmentParameter {
    private final EquipmentType equipmentType;
    private final Class<? extends ElectricEquipment> type;
    private final String company;
    private int power;
    private int width, height, length;
    private double weight;
    private double screenSize;

    EquipmentParameter(EquipmentType equipmentType, Class<? extends ElectricEquipment> type, String company) {
        this.equipmentType = equipmentType;
        this.type = type;
        this.company = company;
    }

}
