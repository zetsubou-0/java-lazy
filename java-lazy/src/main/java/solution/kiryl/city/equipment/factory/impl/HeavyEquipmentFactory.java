package solution.kiryl.city.equipment.factory.impl;

import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.heavy.Refrigerator;
import solution.kiryl.city.equipment.model.heavy.Tv;

public class HeavyEquipmentFactory extends AbstractElectricEquipmentFactoryService {

    @Override
    ElectricEquipment createEquipment(EquipmentParameter parameter) {
        if (Refrigerator.class.equals(parameter.getType())) {
            return new Refrigerator(
                    parameter.getPower(),
                    parameter.getPrice(),
                    parameter.getWeight(),
                    parameter.getWidth(),
                    parameter.getHeight(),
                    parameter.getLength()
            );
        }
        if (Tv.class.equals(parameter.getType())) {
            return new Tv(
                    parameter.getPower(),
                    parameter.getPrice(),
                    parameter.getScreenSize(),
                    parameter.getMatrixType()
            );
        }
        return null;
    }
}
