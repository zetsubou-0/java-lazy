package session.enums;

public enum City {
    GOMEL("Гомель", 1142),
    MISNK("Минск", 1000),
    VITEBSK("Витебск", 1324),
    BREST("Брест", 1234),
    GRODNO("Гродно", 1333),
    MOGILEV("Могилев", 1400),
    UNDEFINED("Не определен", -1);

    private final String name;
    private final int year;

    City(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static City of(int year) {
        for (City city : City.values()) {
            if (year == city.getYear()) {
                return city;
            }
        }
        return UNDEFINED;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
