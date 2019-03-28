package solution.kiryl.city.equipment.model.heavy;

import solution.kiryl.city.equipment.model.BaseElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;

abstract class AbstractHeavyEquipment extends BaseElectricEquipment {

    AbstractHeavyEquipment(int power, int price) {
        this(EquipmentType.HEAVY, power, price);
    }

    private AbstractHeavyEquipment(EquipmentType type, int power, int price) {
        super(type, power, price);
    }
}
