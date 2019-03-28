package solution.kiryl.city.equipment.factory.data.model;

import solution.kiryl.city.equipment.model.ElectricEquipment;
import solution.kiryl.city.equipment.model.EquipmentType;
import solution.kiryl.city.equipment.model.util.CoreType;
import solution.kiryl.city.equipment.model.util.MatrixType;

public class EquipmentParameterBuilder {

    private final EquipmentParameter equipmentParameter;

    private EquipmentParameterBuilder(EquipmentType equipmentType, int power, Class<? extends ElectricEquipment> type, int count, int price) {
        equipmentParameter = new EquipmentParameter(equipmentType, power, type, count, price);
    }

    public static EquipmentParameterBuilder builder(EquipmentType equipmentType, int power, Class<? extends ElectricEquipment> type, int count, int price) {
        return new EquipmentParameterBuilder(equipmentType, power, type, count, price);
    }

    public EquipmentParameterBuilder appendCompany(String company) {
        equipmentParameter.setCompany(company);
        return this;
    }

    public EquipmentParameterBuilder appendWidth(int width) {
        equipmentParameter.setWidth(width);
        return this;
    }

    public EquipmentParameterBuilder appendHeight(int height) {
        equipmentParameter.setHeight(height);
        return this;
    }

    public EquipmentParameterBuilder appendLength(int length) {
        equipmentParameter.setLength(length);
        return this;
    }

    public EquipmentParameterBuilder appendWeight(double weight) {
        equipmentParameter.setWeight(weight);
        return this;
    }

    public EquipmentParameterBuilder appendScreenSize(double screenSize) {
        equipmentParameter.setScreenSize(screenSize);
        return this;
    }

    public EquipmentParameterBuilder appendMatrixType(MatrixType matrixType) {
        equipmentParameter.setMatrixType(matrixType);
        return this;
    }

    public EquipmentParameterBuilder appendCoreType(CoreType coreType) {
        equipmentParameter.setCoreType(coreType);
        return this;
    }

    public EquipmentParameterBuilder appendCores(int cores) {
        equipmentParameter.setCores(cores);
        return this;
    }

    public EquipmentParameterBuilder appendRam(int ram) {
        equipmentParameter.setRam(ram);
        return this;
    }

    public EquipmentParameterBuilder appendHdMemory(int hdMemory) {
        equipmentParameter.setHdMemory(hdMemory);
        return this;
    }

    public EquipmentParameterBuilder appendVolume(double volume) {
        equipmentParameter.setVolume(volume);
        return this;
    }

    public EquipmentParameterBuilder appendBreadCount(int breadCount) {
        equipmentParameter.setBreadCount(breadCount);
        return this;
    }

    public EquipmentParameter build() {
        return equipmentParameter;
    }
}
