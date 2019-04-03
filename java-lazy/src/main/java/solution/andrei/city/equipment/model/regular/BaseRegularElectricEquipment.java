package solution.andrei.city.equipment.model.regular;

import solution.andrei.city.equipment.model.BaseElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

abstract class BaseRegularElectricEquipment extends BaseElectricEquipment {

    BaseRegularElectricEquipment(int power) {
        super(EquipmentType.REGULAR, power);
    }
}
