package solution.andrei.city.equipment.factory.data.impl;

import solution.andrei.city.equipment.factory.data.DataProvider;

import solution.andrei.city.equipment.factory.data.model.EquipmentParameter;
import solution.andrei.city.equipment.factory.data.model.EquipmentParameterBuilder;
import solution.andrei.city.equipment.model.*;

import java.util.ArrayList;
import java.util.List;

public class RandomDataProvider implements DataProvider {

    @Override
    public List<EquipmentParameter> generateParameters(EquipmentType type) {
        List<EquipmentParameter> list = new ArrayList<>();
        switch (type) {
            case HEAVY:
                for (int i = 0; i < 2; i++) {
                    EquipmentParameter parameterHeavy = EquipmentParameterBuilder.getBuilder(EquipmentType.HEAVY, 200 + (Math.round((int)(Math.random() * 10)) * 50), 500 + (Math.round((int)(Math.random() * 10)) * 100))
                            .appendHeight(150 + Math.round((int)(Math.random() * 10)) * 5)
                            .appendLength(50 + Math.round((int)(Math.random() * 10)) * 5)
                            .appendResolutionHeight(400 + Math.round((int)(Math.random() * 10)) * 100)
                            .appendResolutionWidth(900 + Math.round((int)(Math.random() * 10)) * 100)
                            .appendWidth(50 + Math.round((int)(Math.random() * 10)) * 5)
                            .builder();
                    list.add(parameterHeavy);
                }
                break;
            case REGULAR:
                for (int i = 0; i < 2; i++) {
                    EquipmentParameter parameterRegular = EquipmentParameterBuilder.getBuilder(EquipmentType.REGULAR, 1500 + (Math.round((int)(Math.random() * 10)) * 100), 20 + (Math.round((int)(Math.random() * 10)) * 5))
                            .appendCapacity(0.5 + Math.round((Math.random() * 2)))
                            .builder();
                    list.add(parameterRegular);
                }
                break;
            case PORTABLE:
                for (int i = 0; i < 2; i++) {
                    EquipmentParameter parameterPortable = EquipmentParameterBuilder.getBuilder(EquipmentType.PORTABLE, 10 + (Math.round((int)(Math.random() * 6))), 200 + (Math.round((int)(Math.random() * 10)) * 100))
                            .appendScreenSize(3.5 + Math.floor(Math.random() * 70)/10)
                            .appendBatteryCapacity(1500 + (Math.round((int)(Math.random() * 5)) * 1000))
                            .builder();
                    list.add(parameterPortable);
                }
                break;
        }
        return list;
    }
}
