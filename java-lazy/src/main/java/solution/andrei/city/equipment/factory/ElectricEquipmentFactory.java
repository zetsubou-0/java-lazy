package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.factory.data.impl.RandomDataProvider;
import solution.andrei.city.equipment.factory.impl.HeavyEquipmentFactory;
import solution.andrei.city.equipment.factory.impl.PortableEquipmentFactory;
import solution.andrei.city.equipment.factory.impl.RegularEquipmentFactory;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.*;

public final class ElectricEquipmentFactory {
    private ElectricEquipmentFactory() {}

    public static List<ElectricEquipment> create(EquipmentType type) {
        List<ElectricEquipment> listEquipment = new ArrayList<>();
        RandomDataProvider randomDataProvider = new RandomDataProvider();
        Set<ElectricEquipment> electricEquipments;
        switch (type) {
            case HEAVY:
                HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
                electricEquipments = heavyEquipmentFactory.create(randomDataProvider.generateParameters(type));
                listEquipment.addAll(electricEquipments);
                break;
            case PORTABLE:
                PortableEquipmentFactory portableEquipmentFactory = new PortableEquipmentFactory();
                electricEquipments = portableEquipmentFactory.create(randomDataProvider.generateParameters(type));
                listEquipment.addAll(electricEquipments);
                break;
            case REGULAR:
                RegularEquipmentFactory regularEquipmentFactory = new RegularEquipmentFactory();
                electricEquipments = regularEquipmentFactory.create(randomDataProvider.generateParameters(type));
                listEquipment.addAll(electricEquipments);
                break;
        }
        return listEquipment;
    }
}
