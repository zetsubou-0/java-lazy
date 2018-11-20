package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.Collections;
import java.util.Set;

public final class ElectricEquipmentFactory {

    private ElectricEquipmentFactory(){

    }

    public static Set<ElectricEquipment> create(EquipmentType type) {
        return Collections.emptySet();
    }
}
