package solution.andrei.city.equipment.factory.impl;



import solution.andrei.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.andrei.city.equipment.model.ElectricEquipment;
import solution.andrei.city.equipment.model.EquipmentParameter;
import solution.andrei.city.equipment.model.Telephone;


import java.util.*;

public class PortableEquipmentFactory implements ElectricEquipmentFactoryService {

    @Override
    public Set<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        Set<ElectricEquipment> electricEquipments = new HashSet<>();
        for (EquipmentParameter o : parameters) {
            if (o.getPower() >= 10 && o.getPower() <= 12) {
                Telephone telephone = new Telephone(o.getPower(), o.getScreenSize(), o.getBatteryCapacity());
                telephone.setPrice(o.getPrice());
                electricEquipments.add(telephone);
            }
            if (o.getPower() > 12 && o.getPower() <= 15) {
                Refrigerator refrigerator = new Refrigerator(o.getPower(), o.getWidth(), o.getHeight(), o.getLength());
                refrigerator.setPrice(o.getPrice());
                electricEquipments.add(refrigerator);
            }
        }
        return electricEquipments;
    }
    }
}
