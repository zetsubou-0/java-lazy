package solution.andrei.city.equipment.model;

public class EquipmentParameter {
    private final EquipmentType equipmentType;
    private final int power;
    private final int price;
    private int capacity;
    private int width, height, length;
    private double screenSize;
    private int batteryCapacity;
    private int resolutionOnWidth;
    private int resolutionOnHeight;

    public EquipmentParameter(EquipmentType equipmentType, int power, int price) {
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

    public int getCapacity() {
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
        return resolutionOnWidth;
    }

    public int getResolutionHeight() {
        return resolutionOnHeight;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionOnWidth = resolutionWidth;
    }

    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionOnHeight = resolutionHeight;
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
                ", resolutionOnWidth=" + resolutionOnWidth +
                ", resolutionOnHeight=" + resolutionOnHeight +
                '}';
    }
}
