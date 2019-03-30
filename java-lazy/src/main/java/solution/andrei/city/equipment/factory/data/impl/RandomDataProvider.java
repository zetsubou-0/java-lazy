package solution.andrei.city.equipment.factory.data.impl;

import solution.andrei.city.equipment.model.*;

import java.util.ArrayList;
import java.util.List;

public class RandomDataProvider {
    public List<EquipmentParameter> generateParameters(EquipmentType type) {
        List<EquipmentParameter> list = new ArrayList<>();
        switch (type) {
            case HEAVY:
                for (int i = 0; i < 10 ; i++) {
                    EquipmentParameter parameterHeavy = new EquipmentParameter (EquipmentType.HEAVY, (int)(Math.random() * 1000), (int)(Math.random() * 1000));
                    parameterHeavy.setHeight((int)(Math.random() * 1000));
                    parameterHeavy.setLength((int)(Math.random() * 1000));
                    parameterHeavy.setResolutionHeight((int)(Math.random() * 1000));
                    parameterHeavy.setResolutionWidth((int)(Math.random() * 1000));
                    parameterHeavy.setWidth((int)(Math.random() * 1000));
                    list.add(parameterHeavy);
                }
                break;
            case REGULAR:
                for (int i = 0; i < 10; i++) {
                    EquipmentParameter parameterRegular = new EquipmentParameter (EquipmentType.REGULAR, (int)(Math.random() * 100), (int)(Math.random() * 100));
                    parameterRegular.setCapacity((int)(Math.random() * 100));
                    list.add(parameterRegular);
                }

                break;
            case PORTABLE:
                for (int i = 0; i < 10; i++) {
                    EquipmentParameter parameterPortable = new EquipmentParameter (EquipmentType.PORTABLE, (int)(Math.random() * 10), (int)(Math.random() * 10));
                    parameterPortable.setScreenSize((Math.random() * 10));
                    parameterPortable.setBatteryCapacity((int)(Math.random() * 10));
                    list.add(parameterPortable);
                }

                break;
        }
        return list;
    }

    public static void main(String[] args) {
        RandomDataProvider randomDataProvider = new RandomDataProvider();
        for (int i = 0; i < randomDataProvider.generateParameters(EquipmentType.HEAVY).size()  ; i++) {
            System.out.println(randomDataProvider.generateParameters(EquipmentType.HEAVY));
        }
    }
}
