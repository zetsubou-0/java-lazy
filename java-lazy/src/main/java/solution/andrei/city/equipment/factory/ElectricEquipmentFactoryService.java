package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.factory.data.model.EquipmentParameter;
import solution.andrei.city.equipment.model.ElectricEquipment;

import java.util.List;

public interface ElectricEquipmentFactoryService {
    List<ElectricEquipment> create(List<EquipmentParameter> parameters);
}
