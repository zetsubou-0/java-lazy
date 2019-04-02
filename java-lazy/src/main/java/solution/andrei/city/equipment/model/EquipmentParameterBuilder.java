package solution.andrei.city.equipment.model;

public class EquipmentParameterBuilder {
    private final EquipmentType equipmentType;
    private final int power;
    private final int price;
    private double capacity;
    private int width, height, length;
    private double screenSize;
    private int batteryCapacity;
    private int resolutionWidth;
    private int resolutionHeight;

    private EquipmentParameterBuilder(EquipmentParameter equipmentParameter) {
        this.equipmentType = equipmentParameter.getEquipmentType();
        this.power = equipmentParameter.getPower();
        this.price = equipmentParameter.getPrice();
    }

    private EquipmentParameterBuilder appendCapacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    private EquipmentParameterBuilder appendWidth(int width) {
        this.width = width;
        return this;
    }

    private EquipmentParameterBuilder appendHeight(int height) {
        this.height = height;
        return this;
    }

    private EquipmentParameterBuilder appendLength(int length) {
        this.length = length;
        return this;
    }

    private EquipmentParameterBuilder appendScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    private EquipmentParameterBuilder appendBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    private EquipmentParameterBuilder appendResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }

    private EquipmentParameterBuilder appendResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    private EquipmentParameter bulid() {
        EquipmentParameter equipmentParameter = new EquipmentParameter(equipmentType, power, price);
        equipmentParameter.setCapacity(capacity);
        equipmentParameter.setWidth(width);
        equipmentParameter.setHeight(height);
        equipmentParameter.setLength(length);
        equipmentParameter.setScreenSize(screenSize);
        equipmentParameter.setBatteryCapacity(batteryCapacity);
        equipmentParameter.setResolutionWidth(resolutionWidth);
        equipmentParameter.setResolutionHeight(resolutionHeight);
        return equipmentParameter;
    }
}
