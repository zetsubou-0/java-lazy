package solution.kiryl.city.house.builder;

import solution.kiryl.collection.RangeException;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class HouseBuilder {
    private static final String FLAT_COUNT_PER_FLOOR_PARAMETER = "flatCountPerFloor";
    private static final String NUMBER_OF_FLOORS_PARAMETER = "numberOfFloors";
    private static final String MAX_POWER_PARAMETER = "maxPower";
    private static final String PERCENT_PARAMETER = "percent";
    private static final Map<String, BiFunction<HouseBuilder, Integer, HouseBuilder>> MAPPING = new HashMap<>();
    static {
        MAPPING.put(FLAT_COUNT_PER_FLOOR_PARAMETER, HouseBuilder::appendFlatCountPerFloor);
        MAPPING.put(NUMBER_OF_FLOORS_PARAMETER, HouseBuilder::appendNumberOfFloors);
        MAPPING.put(MAX_POWER_PARAMETER, HouseBuilder::appendMaxPower);
        MAPPING.put(PERCENT_PARAMETER, HouseBuilder::appendPercent);
    }

    private int flatCountPerFloor;
    private int numberOfFloors;
    private int percent;
    private int maxPower;

    private HouseBuilder() {

    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public HouseBuilder appendFlatCountPerFloor(int flatCountPerFloor) {
        this.flatCountPerFloor = flatCountPerFloor;
        return this;
    }

    public HouseBuilder appendNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
        return this;
    }

    public HouseBuilder appendPercent(int percent) {
        this.percent = percent;
        return this;
    }

    public HouseBuilder appendMaxPower(int maxPower) {
        this.maxPower = maxPower;
        return this;
    }

    public HouseBuilder appendParams(Map<String, String> params) {
        MAPPING.forEach(processParameter(params));
        return this;
    }

    private BiConsumer<String, BiFunction<HouseBuilder, Integer, HouseBuilder>> processParameter(Map<String, String> params) {
        return (key, mapper) -> {
            try {
                final int value = Integer.parseInt(params.get(key));
                mapper.apply(this, value);
            } catch (NumberFormatException e) {}
        };
    }

    public HouseBuilder appendParams(String[] args) {
        Map<String, String> params = buildParams(args);
        appendParams(params);
        return this;
    }

    private Map<String, String> buildParams(String[] args) {
        if (args == null || args.length == 0) {
            return Collections.emptyMap();
        }
        return Arrays.stream(args)
                .map(arg -> arg.split("="))
                .filter(keyValueArray -> keyValueArray.length == 2)
                .collect(Collectors.toMap(keyValueArray -> keyValueArray[0], keyValueArray -> keyValueArray[1], (oldVal, newVal) -> newVal));
    }

    public House build() throws RangeException {
        return new House(maxPower, flatCountPerFloor * numberOfFloors, percent);
    }
}
