package solution.andrei.city.equipment.factory.data.model;

import solution.andrei.city.equipment.model.EquipmentType;

public class EquipmentParameter {
    private final EquipmentType equipmentType;
    private final int power;
    private final int price;
    private double capacity;
    private int width, height, length;
    private double screenSize;
    private int batteryCapacity;
    private int resolutionWidth;
    private int resolutionHeight;

    EquipmentParameter(EquipmentType equipmentType, int power, int price) {
        this.equipmentType = equipmentType;
        this.power = power;
        this.price = price;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    void setWidth(int width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void setLength(int length) {
        this.length = length;
    }

    void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    @Override
    public String toString() {
        return "EquipmentParameter{" +
                "equipmentType=" + equipmentType +
                ", power=" + power +
                ", price=" + price +
                ", capacity=" + capacity +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                ", resolutionOnWidth=" + resolutionWidth +
                ", resolutionOnHeight=" + resolutionHeight +
                '}';
    }
}
