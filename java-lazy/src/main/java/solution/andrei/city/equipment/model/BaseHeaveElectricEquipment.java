package solution.andrei.city.equipment.model;

abstract class BaseHeaveElectricEquipment extends BaseElectricEquipment {

    BaseHeaveElectricEquipment(int power) {
        super(EquipmentType.HEAVY, power);
    }
}