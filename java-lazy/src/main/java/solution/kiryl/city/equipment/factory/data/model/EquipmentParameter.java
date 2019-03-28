package solution.kiryl.city.equipment.factory.data.model;

import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;
import solution.kiryl.city.equipment.model.util.CoreType;
import solution.kiryl.city.equipment.model.util.MatrixType;

public class EquipmentParameter {
    private final EquipmentType equipmentType;
    private final int power;
    private final Class<? extends ElectricEquipment> type;
    private final int count;
    private final int price;
    private String company;
    private int width;
    private int height;
    private int length;
    private double weight;
    private double screenSize;
    private MatrixType matrixType;
    private CoreType coreType;
    private int cores;
    private int ram;
    private int hdMemory;
    private double volume;
    private int breadCount;

    EquipmentParameter(EquipmentType equipmentType, int power, Class<? extends ElectricEquipment> type, int count, int price) {
        this.equipmentType = equipmentType;
        this.power = power;
        this.type = type;
        this.count = count;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    void setCompany(String company) {
        this.company = company;
    }

    public int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public double getScreenSize() {
        return screenSize;
    }

    void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    void setMatrixType(MatrixType matrixType) {
        this.matrixType = matrixType;
    }

    public CoreType getCoreType() {
        return coreType;
    }

    void setCoreType(CoreType coreType) {
        this.coreType = coreType;
    }

    public int getCores() {
        return cores;
    }

    void setCores(int cores) {
        this.cores = cores;
    }

    public int getRam() {
        return ram;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdMemory() {
        return hdMemory;
    }

    void setHdMemory(int hdMemory) {
        this.hdMemory = hdMemory;
    }

    public double getVolume() {
        return volume;
    }

    void setVolume(double volume) {
        this.volume = volume;
    }

    public int getBreadCount() {
        return breadCount;
    }

    void setBreadCount(int breadCount) {
        this.breadCount = breadCount;
    }
}
