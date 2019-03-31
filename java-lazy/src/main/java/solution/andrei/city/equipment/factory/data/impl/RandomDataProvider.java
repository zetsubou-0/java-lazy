package solution.andrei.city.equipment.factory.data.impl;

import solution.andrei.city.equipment.factory.data.DataProvider;
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
                    EquipmentParameter parameterHeavy = new EquipmentParameter (EquipmentType.HEAVY, 200 + (Math.round((int)(Math.random() * 10)) * 50), 500 + (Math.round((int)(Math.random() * 10)) * 100));
                    parameterHeavy.setHeight(150 + Math.round((int)(Math.random() * 10)) * 5);
                    parameterHeavy.setLength(50 + Math.round((int)(Math.random() * 10)) * 5);
                    parameterHeavy.setResolutionHeight(400 + Math.round((int)(Math.random() * 10)) * 100);
                    parameterHeavy.setResolutionWidth(900 + Math.round((int)(Math.random() * 10)) * 100);
                    parameterHeavy.setWidth(50 + Math.round((int)(Math.random() * 10)) * 5);
                    list.add(parameterHeavy);
                }
                break;
            case REGULAR:
                for (int i = 0; i < 2; i++) {
                    EquipmentParameter parameterRegular = new EquipmentParameter (EquipmentType.REGULAR, 1500 + (Math.round((int)(Math.random() * 10)) * 100), 20 + (Math.round((int)(Math.random() * 10)) * 5));
                    parameterRegular.setCapacity(0.5 + Math.round((Math.random() * 2)));
                    list.add(parameterRegular);
                }

                break;
            case PORTABLE:
                for (int i = 0; i < 2; i++) {
                    EquipmentParameter parameterPortable = new EquipmentParameter (EquipmentType.PORTABLE, 10 + (Math.round((int)(Math.random() * 6))), 200 + (Math.round((int)(Math.random() * 10)) * 100));
                    parameterPortable.setScreenSize(3.5 + Math.floor(Math.random() * 70)/10);
                    parameterPortable.setBatteryCapacity(1500 + (Math.round((int)(Math.random() * 5)) * 1000));
                    list.add(parameterPortable);
                }

                break;
        }
        return list;
    }
}
