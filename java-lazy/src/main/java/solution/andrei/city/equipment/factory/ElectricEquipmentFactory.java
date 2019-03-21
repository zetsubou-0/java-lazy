package solution.andrei.city.equipment.factory;


import solution.andrei.city.equipment.factory.data.impl.RandomDataProvider;
import solution.andrei.city.equipment.factory.impl.HeavyEquipmentFactory;
import solution.andrei.city.equipment.factory.impl.PortableEquipmentFactory;
import solution.andrei.city.equipment.factory.impl.RegularEquipmentFactory;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentType;

import java.util.Map;
import java.util.Set;

public final class ElectricEquipmentFactory {
    private RandomDataProvider j = new RandomDataProvider();
    private HeavyEquipmentFactory k = new HeavyEquipmentFactory();
    private PortableEquipmentFactory p = new PortableEquipmentFactory();
    private RegularEquipmentFactory r = new RegularEquipmentFactory();

    private ElectricEquipmentFactory(){

    }

    public Set<ElectricEquipment> create(EquipmentType type) {
         Map<String, Object> equipmentParameters = j.generateParameters(type);
         Set<ElectricEquipment> f = null;
         if (type == EquipmentType.HEAVY) {
             f = k.create(equipmentParameters);
         }
         if (type == EquipmentType.PORTABLE) {
             f = p.create(equipmentParameters);
         }
         if (type == EquipmentType.REGULAR) {
             f = r.create(equipmentParameters);
         }
         return f;
    }
}
