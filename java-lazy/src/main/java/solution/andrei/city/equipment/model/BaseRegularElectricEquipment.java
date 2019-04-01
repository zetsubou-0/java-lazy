package solution.andrei.city.equipment.model;

abstract class BaseRegularElectricEquipment extends BaseElectricEquipment {

    BaseRegularElectricEquipment(int power) {
        super(EquipmentType.REGULAR, power);
    }
}
