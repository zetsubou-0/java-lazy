package solution.kiryl.city.equipment.factory;

import solution.kiryl.city.equipment.factory.data.DataProvider;
import solution.kiryl.city.equipment.factory.data.impl.RandomDataProvider;
import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.factory.impl.HeavyEquipmentFactory;
import solution.kiryl.city.equipment.factory.impl.PortableEquipmentFactory;
import solution.kiryl.city.equipment.factory.impl.RegularEquipmentFactory;
import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public final class ElectricEquipmentFactory {

    private static final DataProvider DATA_PROVIDER = new RandomDataProvider();
    private static final Map<EquipmentType, ElectricEquipmentFactoryService> FACTORIES = new EnumMap<>(EquipmentType.class);
    static {
        FACTORIES.put(EquipmentType.PORTABLE, new PortableEquipmentFactory());
        FACTORIES.put(EquipmentType.REGULAR, new RegularEquipmentFactory());
        FACTORIES.put(EquipmentType.HEAVY, new HeavyEquipmentFactory());
    }

    private ElectricEquipmentFactory() {
    }

    public static List<ElectricEquipment> create(EquipmentType type) {
        final List<EquipmentParameter> equipmentParameters = DATA_PROVIDER.generateParameters(type);
        final ElectricEquipmentFactoryService factory = FACTORIES.get(type);
        return factory.create(equipmentParameters);
    }
}
