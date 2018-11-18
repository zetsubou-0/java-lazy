package solution.kiryl.city.equipment.model;

import solution.kiryl.city.equipment.store.Warranty;

public interface ElectricEquipment {
    EquipmentType type();
    int power();
    int price();
    Warranty getWarranty();
}
