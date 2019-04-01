package solution.andrei.city.equipment.factory.impl;



import solution.andrei.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.andrei.city.equipment.factory.data.impl.RandomDataProvider;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;
import solution.andrei.city.equipment.model.EquipmentType;
import solution.andrei.city.equipment.model.Telephone;


import java.util.*;

public class PortableEquipmentFactory implements ElectricEquipmentFactoryService {

    @Override
    public List<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        List<ElectricEquipment> electricEquipments = new ArrayList<>();
        for (EquipmentParameter o : parameters) {
                Telephone telephone = new Telephone(o.getPower(), o.getScreenSize(), o.getBatteryCapacity());
                telephone.setPrice(o.getPrice());
                electricEquipments.add(telephone);
        }
        return electricEquipments;
    }

    public static void main(String[] args) {
        RandomDataProvider randomDataProvider = new RandomDataProvider();
        List<EquipmentParameter> l = randomDataProvider.generateParameters(EquipmentType.PORTABLE);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        PortableEquipmentFactory portableEquipmentFactory = new PortableEquipmentFactory();
        List<ElectricEquipment> s = portableEquipmentFactory.create(l);
        for (ElectricEquipment o : s) {
            System.out.println(o);
        }
    }
}
