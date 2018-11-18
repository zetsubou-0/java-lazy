package solution.kiryl.city.equipment.factory;

import solution.kiryl.city.equipment.model.ElectricEquipment;

import java.util.Map;
import java.util.Set;

public interface ElectricEquipmentFactoryService {
    Set<ElectricEquipment> create(Map<String, Object> parameters);
}
