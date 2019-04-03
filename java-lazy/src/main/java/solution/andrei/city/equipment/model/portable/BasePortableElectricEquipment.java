package solution.andrei.city.equipment.model.portable;

import solution.andrei.city.equipment.model.BaseElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

abstract class BasePortableElectricEquipment extends BaseElectricEquipment {

    BasePortableElectricEquipment(int power) {
        super(EquipmentType.PORTABLE, power);
    }
}
