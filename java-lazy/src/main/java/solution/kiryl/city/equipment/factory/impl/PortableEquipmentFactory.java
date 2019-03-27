package solution.kiryl.city.equipment.factory.impl;

import solution.kiryl.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.ElectricEquipment;

import java.util.Collections;
import java.util.List;

public class PortableEquipmentFactory implements ElectricEquipmentFactoryService {
    @Override
    public List<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        return Collections.emptyList();
    }
}
