package solution.andrei.city.equipment.factory;

import solution.andrei.city.equipment.factory.data.impl.RandomDataProvider;
import solution.andrei.city.equipment.factory.impl.HeavyEquipmentFactory;
import solution.andrei.city.equipment.factory.impl.PortableEquipmentFactory;
import solution.andrei.city.equipment.factory.impl.RegularEquipmentFactory;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class ElectricEquipmentFactory {
    private ElectricEquipmentFactory() {}

    public static List<ElectricEquipment> create(EquipmentType type) {
        List<ElectricEquipment> listEquipment = new ArrayList<>();
        if (type.equals(EquipmentType.HEAVY)) {
            HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
            RandomDataProvider randomDataProvider = new RandomDataProvider();
            Set<ElectricEquipment> electricEquipments = heavyEquipmentFactory.create(randomDataProvider.generateParameters(type));
            for (ElectricEquipment equipment : electricEquipments) {
                listEquipment.add(equipment);
            }
        }
        if (type.equals(EquipmentType.PORTABLE)) {
            PortableEquipmentFactory portableEquipmentFactory = new PortableEquipmentFactory();
            RandomDataProvider randomDataProvider = new RandomDataProvider();
            Set<ElectricEquipment> electricEquipments = portableEquipmentFactory.create(randomDataProvider.generateParameters(type));
            for (ElectricEquipment equipment : electricEquipments) {
                listEquipment.add(equipment);
            }
        }
        if (type.equals(EquipmentType.REGULAR)) {
            RegularEquipmentFactory regularEquipmentFactory = new RegularEquipmentFactory();
            RandomDataProvider randomDataProvider = new RandomDataProvider();
            Set<ElectricEquipment> electricEquipments = regularEquipmentFactory.create(randomDataProvider.generateParameters(type));
            for (ElectricEquipment equipment : electricEquipments) {
                listEquipment.add(equipment);
            }
        }
        return listEquipment;
    }
}
