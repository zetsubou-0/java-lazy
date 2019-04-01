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
        Set<ElectricEquipment> electricEquipments;
        if (parameters.get(0).getEquipmentType().equals(EquipmentType.HEAVY)) {
            HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
            electricEquipments = heavyEquipmentFactory.create(parameters);
            listEquipment.addAll(electricEquipments);
        }else if (parameters.get(0).getEquipmentType().equals(EquipmentType.PORTABLE)) {
            HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
            electricEquipments = heavyEquipmentFactory.create(parameters);
            listEquipment.addAll(electricEquipments);
        }else if (parameters.get(0).getEquipmentType().equals(EquipmentType.REGULAR)) {
            HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
            electricEquipments = heavyEquipmentFactory.create(parameters);
            listEquipment.addAll(electricEquipments);
        }
        return listEquipment;
    }
}
