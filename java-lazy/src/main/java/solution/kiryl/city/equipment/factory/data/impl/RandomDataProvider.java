package solution.kiryl.city.equipment.factory.data.impl;

import solution.kiryl.city.equipment.factory.data.DataProvider;
import solution.kiryl.city.equipment.model.EquipmentType;

import java.util.Collections;
import java.util.Map;

public class RandomDataProvider implements DataProvider {

    @Override
    public Map<String, Object> generateParameters(EquipmentType type) {
        return Collections.emptyMap();
    }
}
