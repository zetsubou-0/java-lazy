package solution.kiryl.city.equipment.model.portable;

import solution.kiryl.city.equipment.model.util.CoreType;

public class Laptop extends AbstractPortableEquipment {

    private CoreType coreType = CoreType.INTEL;
    private int cores = 1;
    private int ram = 1024;
    private int hdMemory = 500;

    public Laptop(int power, int price) {
        super(power, price);
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public CoreType getCoreType() {
        return coreType;
    }

    public void setCoreType(CoreType coreType) {
        this.coreType = coreType;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdMemory() {
        return hdMemory;
    }

    public void setHdMemory(int hdMemory) {
        this.hdMemory = hdMemory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "coreType=" + coreType +
                ", cores=" + cores +
                ", ram=" + ram +
                ", hdMemory=" + hdMemory +
                ", " + super.toString() +
                '}';
    }
}
