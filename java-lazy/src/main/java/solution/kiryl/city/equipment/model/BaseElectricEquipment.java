package solution.kiryl.city.equipment.model;

import solution.kiryl.city.equipment.store.Warranty;

public abstract class BaseElectricEquipment implements ElectricEquipment {
    private final EquipmentType type;
    private final int power;
    private final int price;

    private Warranty warranty;

    protected BaseElectricEquipment(EquipmentType type, int power, int price) {
        this.type = type;
        this.power = power;
        this.price = price;
    }

    @Override
    public EquipmentType type() {
        return type;
    }

    @Override
    public int power() {
        return power;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Warranty getWarranty() {
        return warranty;
    }

    public EquipmentType getType() {
        return type();
    }

    public int getPower() {
        return power();
    }

    public int getPrice() {
        return price();
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "type=" + type +
                ", power=" + power +
                ", price=" + price +
                ", warranty=" + warranty;
    }
}
