package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;

import java.util.List;
import java.util.Set;

public interface ElectricEquipmentFactoryService {
    Set<ElectricEquipment> create(List<EquipmentParameter> parameters);
}
