package solution.andrei.city.house;

import solution.andrei.city.equipment.model.ElectricEquipment;

import java.util.LinkedList;
import java.util.List;

public class Apartment {
    private final List<ElectricEquipment> electricEquipments = new LinkedList<>();
    private final int money;
    private final int maxPower;

    public Apartment(int money, int maxPower) {
        this.money = money;
        this.maxPower = maxPower;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "electricEquipments=" + electricEquipments +
                ", money=" + money +
                ", maxPower=" + maxPower +
                '}';
    }
}
