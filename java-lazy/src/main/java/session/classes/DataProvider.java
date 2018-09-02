package session.classes;

public interface DataProvider {
    void save(String name, Data info);
    Data read(String name);
}
