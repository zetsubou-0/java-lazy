package solution.kiryl.city.equipment.factory.data;

import solution.kiryl.city.equipment.model.EquipmentType;

import java.util.Map;

public interface DataProvider {
    Map<String, Object> generateParameters(EquipmentType type);
}
