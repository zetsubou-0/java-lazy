package solution.andrei.city.equipment.factory.impl;



import solution.andrei.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;

import java.util.List;
import java.util.Set;

public class HeavyEquipmentFactory implements ElectricEquipmentFactoryService {

    @Override
    public Set<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        return null;
    }
}
