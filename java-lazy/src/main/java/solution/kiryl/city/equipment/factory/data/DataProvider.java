package solution.kiryl.city.equipment.factory.data;

import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.EquipmentType;

import java.util.List;

public interface DataProvider {
    List<EquipmentParameter> generateParameters(EquipmentType type);
}
