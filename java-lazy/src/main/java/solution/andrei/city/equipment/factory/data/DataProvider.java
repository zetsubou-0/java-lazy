package solution.andrei.city.equipment.factory.data;

import solution.andrei.city.equipment.model.EquipmentType;

import java.util.Map;

public interface DataProvider {
    Map<String, Object> generateParameters(EquipmentType type);
}
