package solution.kiryl.city.equipment.factory.impl;

import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.regular.Kettle;
import solution.kiryl.city.equipment.model.regular.Toaster;

public class RegularEquipmentFactory extends AbstractElectricEquipmentFactoryService {

    @Override
    ElectricEquipment createEquipment(EquipmentParameter parameter) {
        if (Kettle.class.equals(parameter.getType())) {
            return new Kettle(parameter.getPower(), parameter.getPrice(), parameter.getVolume());
        }
        if (Toaster.class.equals(parameter.getType())) {
            return new Toaster(parameter.getPower(), parameter.getPrice(), parameter.getBreadCount());
        }
        return null;
    }
}
