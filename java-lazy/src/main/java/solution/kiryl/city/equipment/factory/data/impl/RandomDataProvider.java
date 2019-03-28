package solution.kiryl.city.equipment.factory.data.impl;

import solution.kiryl.city.equipment.factory.data.DataProvider;
import solution.kiryl.city.equipment.factory.data.model.EquipmentParameter;
import solution.kiryl.city.equipment.factory.data.model.EquipmentParameterBuilder;
import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;
import solution.kiryl.city.equipment.model.heavy.Refrigerator;
import solution.kiryl.city.equipment.model.heavy.Tv;
import solution.kiryl.city.equipment.model.portable.Laptop;
import solution.kiryl.city.equipment.model.portable.Phone;
import solution.kiryl.city.equipment.model.regular.Kettle;
import solution.kiryl.city.equipment.model.regular.Toaster;
import solution.kiryl.city.equipment.model.util.CoreType;
import solution.kiryl.city.equipment.model.util.MatrixType;

import java.util.*;

public class RandomDataProvider implements DataProvider {

    private static Map<EquipmentType, List<Class<? extends ElectricEquipment>>> CLASSES = new HashMap<>();
    private static List<Class<? extends ElectricEquipment>> HEAVY = new ArrayList<>();
    private static List<Class<? extends ElectricEquipment>> PORTABLE = new ArrayList<>();
    private static List<Class<? extends ElectricEquipment>> REGULAR = new ArrayList<>();
    static {
        HEAVY.add(Refrigerator.class);
        HEAVY.add(Tv.class);
        PORTABLE.add(Phone.class);
        PORTABLE.add(Laptop.class);
        REGULAR.add(Kettle.class);
        REGULAR.add(Toaster.class);
        CLASSES.put(EquipmentType.HEAVY, HEAVY);
        CLASSES.put(EquipmentType.PORTABLE, PORTABLE);
        CLASSES.put(EquipmentType.REGULAR, REGULAR);
    }

    public List<EquipmentParameter> generateParameters(EquipmentType type) {
        final Random random = new Random();
        final int count = random.nextInt(10);
        final List<EquipmentParameter> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            result.add(generateEquipmentParameter(type, random));
        }
        return result;
    }

    private EquipmentParameter generateEquipmentParameter(EquipmentType type, Random random) {
        final Class<? extends ElectricEquipment> equipmentClass = generateClass(random, type);
        final int power = generatePower(random, type);
        final int count = generateCount(random);
        final int price = generatePrice(random, type);
        EquipmentParameterBuilder builder = EquipmentParameterBuilder.builder(type, power, equipmentClass, count, price);
        return addParameters(builder, random, equipmentClass)
                .build();
    }

    private EquipmentParameterBuilder addParameters(EquipmentParameterBuilder builder, Random random, Class<? extends ElectricEquipment> equipmentClass) {
        if (Tv.class.equals(equipmentClass)) {
            builder.appendScreenSize(random.nextDouble() * 50 + 5)
                    .appendMatrixType(MatrixType.values()[random.nextInt(MatrixType.values().length)]);
        } else if (Refrigerator.class.equals(equipmentClass)) {
            builder.appendWeight(random.nextDouble() * 30 + 50)
                    .appendWidth(random.nextInt(20) + 20)
                    .appendHeight(random.nextInt(40) + 30)
                    .appendLength(random.nextInt(80) + 40);
        } else if (Laptop.class.equals(equipmentClass)) {
            builder.appendCores(random.nextInt(4) + 1)
                    .appendCoreType(CoreType.values()[random.nextInt(CoreType.values().length)])
                    .appendRam((random.nextInt(4) + 1) * 1024)
                    .appendHdMemory(random.nextInt(2000) + 500);
        } else if (Phone.class.equals(equipmentClass)) {
            builder.appendScreenSize(random.nextDouble() * 5 + 2);
        } else if (Kettle.class.equals(equipmentClass)) {
            builder.appendVolume(random.nextDouble() * 4 + 0.5);
        } else if (Toaster.class.equals(equipmentClass)) {
            builder.appendBreadCount((random.nextInt(2) + 1) * 2);
        }
        return builder;
    }

    private int generatePrice(Random random, EquipmentType type) {
        switch (type) {
            case HEAVY:
                return getPrice(random, 20);
            case PORTABLE:
                return getPrice(random, 1);
            case REGULAR:
                return getPrice(random, 8);
        }
        return 0;
    }

    private int generateCount(Random random) {
        return random.nextInt(100);
    }

    private int generatePower(Random random, EquipmentType type) {
        switch (type) {
            case HEAVY:
                return getPower(random, 20);
            case PORTABLE:
                return getPower(random, 1);
            case REGULAR:
                return getPower(random, 8);
        }
        return 0;
    }

    private int getPrice(Random random, int multiplier) {
        final int BASE_PRICE = 100;
        return (random.nextInt(BASE_PRICE) + 1) * multiplier;
    }

    private int getPower(Random random, int multiplier) {
        final int BASE_POWER = 500;
        return (random.nextInt(multiplier) + 1) * BASE_POWER;
    }

    private Class<? extends ElectricEquipment> generateClass(Random random, EquipmentType type) {
        List<Class<? extends ElectricEquipment>> classList = CLASSES.getOrDefault(type, Collections.emptyList());
        if (classList.size() == 0) {
            throw new IllegalArgumentException("Class for " + type + " type not found");
        }
        return classList.get(random.nextInt(classList.size()));
    }
}
