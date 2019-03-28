package solution.kiryl.city.equipment.model.portable;

import solution.kiryl.city.equipment.model.BaseElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;

abstract class AbstractPortableEquipment extends BaseElectricEquipment {

    AbstractPortableEquipment(int power, int price) {
        this(EquipmentType.PORTABLE, power, price);
    }

    private AbstractPortableEquipment(EquipmentType type, int power, int price) {
        super(type, power, price);
    }
}
