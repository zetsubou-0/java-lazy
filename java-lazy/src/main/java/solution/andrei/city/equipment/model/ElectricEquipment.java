package solution.andrei.city.equipment.model;

import solution.andrei.city.equipment.store.Warranty;

public interface ElectricEquipment {
    EquipmentType type();
    int power();
    int price();
    Warranty getWarranty();
}
