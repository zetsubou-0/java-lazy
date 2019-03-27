package solution.kiryl.city.equipment.factory.data.model;

import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;

public class EquipmentParameter {
    private final EquipmentType equipmentType;
    private final int power;
    private final Class<? extends ElectricEquipment> type;
    private final int count;
    private String company;
    private int width;
    private int height;
    private int length;
    private double weight;
    private double screenSize;

    public EquipmentParameter(EquipmentType equipmentType, int power, Class<? extends ElectricEquipment> type, int count) {
        this.equipmentType = equipmentType;
        this.power = power;
        this.type = type;
        this.count = count;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public int getPower() {
        return power;
    }

    public Class<? extends ElectricEquipment> getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
