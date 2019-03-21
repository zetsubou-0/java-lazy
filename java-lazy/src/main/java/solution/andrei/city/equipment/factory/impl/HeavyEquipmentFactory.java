package solution.andrei.city.equipment.factory.impl;



import solution.andrei.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavyEquipmentFactory implements ElectricEquipmentFactoryService {
    public Set<ElectricEquipment> create(Map<String, Object> parameters) {
        Set<ElectricEquipment> srt = new HashSet<>();
        Set<Map.Entry<String, Object>> s = parameters.entrySet();
        for(Map.Entry<String, Object> f : s) {
            if (EquipmentType.HEAVY.equals(f.getValue())) {
                srt.add((ElectricEquipment)f.getValue());
            }
        }
        return srt;
    }
}
