package solution.kiryl.city.equipment.factory.impl;

import solution.kiryl.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.kiryl.city.equipment.model.ElectricEquipment;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class PortableEquipmentFactory implements ElectricEquipmentFactoryService {
    @Override
    public Set<ElectricEquipment> create(Map<String, Object> parameters) {
        return Collections.emptySet();
    }
}
