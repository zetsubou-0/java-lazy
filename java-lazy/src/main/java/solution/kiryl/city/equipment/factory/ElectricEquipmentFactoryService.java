package solution.kiryl.city.equipment.factory;

import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.ElectricEquipment;

import java.util.List;

public interface ElectricEquipmentFactoryService {
    List<ElectricEquipment> create(List<EquipmentParameter> parameters);
}
