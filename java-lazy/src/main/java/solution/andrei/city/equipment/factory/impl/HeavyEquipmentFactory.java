package solution.andrei.city.equipment.factory.impl;



import solution.andrei.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.andrei.city.equipment.factory.data.impl.RandomDataProvider;
import solution.andrei.city.equipment.model.*;

import java.util.ArrayList;
import java.util.List;

public class HeavyEquipmentFactory implements ElectricEquipmentFactoryService {

    @Override
    public List<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        List<ElectricEquipment> electricEquipments = new ArrayList<>();
        for (EquipmentParameter o : parameters) {
            if (o.getPower() >= 200 && o.getPower() <= 300) {
                TV tv = new TV(o.getPower(), o.getResolutionWidth(), o.getResolutionHeight());
                tv.setPrice(o.getPrice());
                electricEquipments.add(tv);
            }
            if (o.getPower() > 300 && o.getPower() <= 650) {
                Refrigerator refrigerator = new Refrigerator(o.getPower(), o.getWidth(), o.getHeight(), o.getLength());
                refrigerator.setPrice(o.getPrice());
                electricEquipments.add(refrigerator);
            }
        }
        return electricEquipments;
    }

    public static void main(String[] args) {
        RandomDataProvider randomDataProvider = new RandomDataProvider();
        List<EquipmentParameter> l = randomDataProvider.generateParameters(EquipmentType.HEAVY);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        HeavyEquipmentFactory heavyEquipmentFactory = new HeavyEquipmentFactory();
        List<ElectricEquipment> s = heavyEquipmentFactory.create(l);
        for (ElectricEquipment o : s) {
            System.out.println(o);
        }
    }
}
