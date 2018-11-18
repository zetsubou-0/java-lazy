package solution.kiryl.city.equipment.model;

import solution.kiryl.city.equipment.store.Warranty;

public class BaseElectricEquipment implements ElectricEquipment {
    private final EquipmentType type;
    private final int power;

    private int price;
    private Warranty warranty;

    BaseElectricEquipment(EquipmentType type, int power) {
        this.type = type;
        this.power = power;
    }

    @Override
    public EquipmentType type() {
        return null;
    }

    @Override
    public int power() {
        return 0;
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public Warranty getWarranty() {
        return null;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }
}
