package solution.andrei.city.equipment.model;



public class EquipmentParametrBuilder {
    private final EquipmentType equipmentType;
    private final int power;
    private final int price;
    private double capacity;
    private int width, height, length;
    private double screenSize;
    private int batteryCapacity;
    private int resolutionWidth;
    private int resolutionHeight;

    private EquipmentParametrBuilder(EquipmentType equipmentType, int power, int price) {
        this.equipmentType = equipmentType;
        this.power = power;
        this.price = price;
    }

    public EquipmentParametrBuilder appendCapacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public EquipmentParametrBuilder appendWidth(int width) {
        this.width = width;
        return this;
    }

    public EquipmentParametrBuilder appendHeight(int height) {
        this.height = height;
        return this;
    }

    public EquipmentParametrBuilder appendLength(int length) {
        this.length = length;
        return this;
    }

    public EquipmentParametrBuilder appendScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public EquipmentParametrBuilder appendBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public EquipmentParametrBuilder appendResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }

    public EquipmentParametrBuilder appendResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }

    public static EquipmentParametrBuilder getBuilder(EquipmentType equipmentType, int power, int price) {
        return new EquipmentParametrBuilder(equipmentType, power, price);
    }

    public EquipmentParameter builde() {
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
        EquipmentParameter equipmentParameter = EquipmentParametrBuilder.getBuilder(EquipmentType.HEAVY, 40, 30)
                .appendBatteryCapacity(30)
                .appendCapacity(50)
                .appendHeight(46)
                .builde();
    }
}
