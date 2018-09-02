package session.classes;

public class NewsPaper {
    private final String name;
    private final Data info;

    public NewsPaper(String name, Data info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public Data getInfo() {
        return info;
    }
}
