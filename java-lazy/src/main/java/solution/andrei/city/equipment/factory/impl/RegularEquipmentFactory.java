package solution.andrei.city.equipment.factory.impl;



import solution.andrei.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.andrei.city.equipment.factory.data.impl.RandomDataProvider;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;
import solution.andrei.city.equipment.model.EquipmentType;
import solution.andrei.city.equipment.model.Kettle;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegularEquipmentFactory implements ElectricEquipmentFactoryService {

    @Override
    public Set<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        Set<ElectricEquipment> electricEquipments = new HashSet<>();
        for (EquipmentParameter o : parameters) {
            Kettle kettle = new Kettle(o.getPower(), o.getCapacity());
            kettle.setPrice(o.getPrice());
            electricEquipments.add(kettle);
        }
        return electricEquipments;
    }

    public static void main(String[] args) {
        RandomDataProvider randomDataProvider = new RandomDataProvider();
        List<EquipmentParameter> l = randomDataProvider.generateParameters(EquipmentType.REGULAR);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        RegularEquipmentFactory regularEquipmentFactory = new RegularEquipmentFactory();
        Set<ElectricEquipment> s = regularEquipmentFactory.create(l);
        for (ElectricEquipment o : s) {
            System.out.println(o);
        }
    }
}
