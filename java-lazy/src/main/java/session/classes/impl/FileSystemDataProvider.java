package session.classes.impl;

import session.classes.Data;
import session.classes.DataProvider;

public class FileSystemDataProvider implements DataProvider {

    private String[] paths = new String[10];
    private Data[] data = new Data[10];

    @Override
    public void save(String name, Data info) {
        for (int i = 0; i < paths.length; i++) {
            if (paths[i] == null) {
                paths[i] = name;
                data[i] = info;
            }
            if (name.equals(paths[i])) {
                return;
            }
        }
    }

    @Override
    public Data read(String name) {
        for (int i = 0; i < paths.length; i++) {
            if (name.equals(paths[i])) {
                return data[i];
            }
        }
        return null;
    }
}
