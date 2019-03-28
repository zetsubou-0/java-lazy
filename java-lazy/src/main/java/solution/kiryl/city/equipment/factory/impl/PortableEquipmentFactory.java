package solution.kiryl.city.equipment.factory.impl;

import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.portable.Laptop;
import solution.kiryl.city.equipment.model.portable.Phone;

public class PortableEquipmentFactory extends AbstractElectricEquipmentFactoryService {

    @Override
    ElectricEquipment createEquipment(EquipmentParameter parameter) {
        if (Phone.class.equals(parameter.getType())) {
            return new Phone(parameter.getPower(), parameter.getPrice(), parameter.getScreenSize());
        }
        if (Laptop.class.equals(parameter.getType())) {
            final Laptop laptop = new Laptop(parameter.getPower(), parameter.getPrice());
            laptop.setCores(parameter.getCores());
            laptop.setCoreType(parameter.getCoreType());
            laptop.setHdMemory(parameter.getHdMemory());
            laptop.setRam(parameter.getRam());
        }
        return null;
    }
}
