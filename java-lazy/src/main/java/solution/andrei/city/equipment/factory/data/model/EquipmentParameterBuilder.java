package solution.andrei.city.equipment.factory.data.model;

import solution.andrei.city.equipment.model.EquipmentType;

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

    private EquipmentParameterBuilder(EquipmentType equipmentType, int power, int price) {
        this.equipmentType = equipmentType;
        this.power = power;
        this.price = price;
    }

    public EquipmentParameterBuilder appendCapacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public EquipmentParameterBuilder appendWidth(int width) {
        this.width = width;
        return this;
    }

    public EquipmentParameterBuilder appendHeight(int height) {
        this.height = height;
        return this;
    }

    public EquipmentParameterBuilder appendLength(int length) {
        this.length = length;
        return this;
    }

    public EquipmentParameterBuilder appendScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public EquipmentParameterBuilder appendBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public EquipmentParameterBuilder appendResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }

    public EquipmentParameterBuilder appendResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }

    public static EquipmentParameterBuilder getBuilder(EquipmentType equipmentType, int power, int price) {
        return new EquipmentParameterBuilder(equipmentType, power, price);
    }

    public EquipmentParameter builder() {
        EquipmentParameter equipmentParameter = new EquipmentParameter(equipmentType, power, price);
        equipmentParameter.setCapacity(capacity);
        equipmentParameter.setWidth(width);
        equipmentParameter.setHeight(height);
        equipmentParameter.setLength(length);
        equipmentParameter.setScreenSize(screenSize);
        equipmentParameter.setResolutionHeight(resolutionHeight);
        equipmentParameter.setResolutionWidth(resolutionWidth);
        equipmentParameter.setBatteryCapacity(batteryCapacity);
        return equipmentParameter;
    }

    public static void main(String[] args) {
        EquipmentParameter equipmentParameter = EquipmentParameterBuilder.getBuilder(EquipmentType.HEAVY, 40, 30)
                .appendBatteryCapacity(30)
                .appendCapacity(50)
                .appendHeight(46)
                .builder();
    }
}
