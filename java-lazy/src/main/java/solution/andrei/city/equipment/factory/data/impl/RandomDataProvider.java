package solution.andrei.city.equipment.factory.data.impl;

import solution.andrei.city.equipment.model.EquipmentType;
import solution.andrei.city.equipment.model.Kettle;
import solution.andrei.city.equipment.model.TV;
import solution.andrei.city.equipment.model.Telephone;

import java.util.HashMap;
import java.util.Map;

public class RandomDataProvider {
    public Map<String, Object> generateParameters(EquipmentType type) {
        Map<String, Object> map = new HashMap<>();
        if (type == EquipmentType.PORTABLE) {
            for (int i = 0; i < 3; i++) {
                map.put("телефон", new Telephone((int)(Math.random() * 400)));
            }
        }else if (type == EquipmentType.REGULAR) {
            for (int i = 0; i < 3; i++) {
                map.put("чайник", new Kettle((int)(Math.random() * 600)));
            }
        }else if (type == EquipmentType.HEAVY) {
            for (int i = 0; i < 3; i++) {
                map.put("телик", new TV((int)(Math.random() * 800)));
            }
        }
        return map;
    }
}
