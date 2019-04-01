package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.factory.impl.HeavyEquipmentFactory;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.*;

public final class ElectricEquipmentFactory {
    private ElectricEquipmentFactory() {}

    public static List<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        List<ElectricEquipment> listEquipment = new ArrayList<>();
        HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
        Set<ElectricEquipment> electricEquipments;
        switch (parameters.get(0).getEquipmentType()) {
            case HEAVY:
                electricEquipments = heavyEquipmentFactory.create(parameters);
                listEquipment.addAll(electricEquipments);
                break;
            case PORTABLE:
                electricEquipments = heavyEquipmentFactory.create(parameters);
                listEquipment.addAll(electricEquipments);
                break;
            case REGULAR:
                electricEquipments = heavyEquipmentFactory.create(parameters);
                listEquipment.addAll(electricEquipments);
        }
        return listEquipment;
    }
}
