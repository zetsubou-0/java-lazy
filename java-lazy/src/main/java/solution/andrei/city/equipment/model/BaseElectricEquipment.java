package solution.andrei.city.equipment.model;

import solution.andrei.city.equipment.store.Warranty;

public abstract class BaseElectricEquipment implements ElectricEquipment{

    private final EquipmentType type;
    private final int power;
    private int price;
    private Warranty warranty;

    BaseElectricEquipment(EquipmentType type, int power) {
        this.type = type;
        this.power = power;
    }

    public EquipmentType type() {
        return type;
    }

    public int power() {
        return power;
    }

    public int price() {
        return price;
    }

    public EquipmentType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price) {
        this.price = price;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public Warranty getWarranty() {
        return warranty;
    }


}
