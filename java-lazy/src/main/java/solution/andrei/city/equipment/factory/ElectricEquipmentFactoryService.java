package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;

import java.util.List;

public interface ElectricEquipmentFactoryService {
    List<ElectricEquipment> create(List<EquipmentParameter> parameters);
}
