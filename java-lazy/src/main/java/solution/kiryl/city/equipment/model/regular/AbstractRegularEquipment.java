package solution.kiryl.city.equipment.model.regular;

import solution.kiryl.city.equipment.model.BaseElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;

abstract class AbstractRegularEquipment extends BaseElectricEquipment {

    AbstractRegularEquipment(int power, int price) {
        this(EquipmentType.REGULAR, power, price);
    }

    private AbstractRegularEquipment(EquipmentType type, int power, int price) {
        super(type, price, power);
    }
}
