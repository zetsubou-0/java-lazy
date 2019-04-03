package solution.andrei.city.equipment.model.heavy;

import solution.andrei.city.equipment.model.BaseElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

abstract class BaseHeaveElectricEquipment extends BaseElectricEquipment {

    BaseHeaveElectricEquipment(int power) {
        super(EquipmentType.HEAVY, power);
    }
}