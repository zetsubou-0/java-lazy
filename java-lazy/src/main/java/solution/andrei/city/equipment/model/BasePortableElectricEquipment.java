package solution.andrei.city.equipment.model;

abstract class BasePortableElectricEquipment extends BaseElectricEquipment {

    BasePortableElectricEquipment(int power) {
        super(EquipmentType.PORTABLE, power);
    }
}
