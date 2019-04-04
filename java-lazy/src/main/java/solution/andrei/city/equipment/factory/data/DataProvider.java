package solution.andrei.city.equipment.factory.data;

import solution.andrei.city.equipment.factory.data.model.EquipmentParameter;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.List;


public interface DataProvider {
    List<EquipmentParameter> generateParameters(EquipmentType type);
}
