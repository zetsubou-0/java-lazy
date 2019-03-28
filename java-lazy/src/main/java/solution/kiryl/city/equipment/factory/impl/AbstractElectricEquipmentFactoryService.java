package solution.kiryl.city.equipment.factory.impl;

import solution.kiryl.city.equipment.factory.ElectricEquipmentFactoryService;
import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.ElectricEquipment;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractElectricEquipmentFactoryService implements ElectricEquipmentFactoryService {

    @Override
    public List<ElectricEquipment> create(List<EquipmentParameter> parameters) {
        final List<ElectricEquipment> equipments = new ArrayList<>(parameters.size());
        for (EquipmentParameter parameter : parameters) {
            final ElectricEquipment equipment = createEquipment(parameter);
            if (equipment == null) {
                continue;
            }
            for (int i = 0; i < parameter.getCount(); i++) {
                equipments.add(equipment);
            }
        }
        return equipments;
    }

    abstract ElectricEquipment createEquipment(EquipmentParameter parameter);
}
