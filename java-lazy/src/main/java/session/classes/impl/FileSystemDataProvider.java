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
                addPath(i, name);
                addData(i, info);
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

    /**
     * Метод ложит элемент (path) в массив на место index
     * Внутренняя реализация: если массив достиг максимального размера, он увиличивается в 2 раза
     * @param index индекс элемента, куда ты хочешь положить данные
     * @param path путь (элемент)
     */
    public void addPath(int index, String path) {
        if (index < paths.length) {
            paths[index] = path;
        }
        if (index == paths.length) {
            String[] newPaths = new String[paths.length * 2];
            for (int i = 0; i < paths.length; i++) {
                newPaths[i] = paths[i];
            }
            newPaths[index] = path;
            paths = newPaths;
        }
    }

    public void addData(int index, Data data) {
        // this.data - массив
        // data - аргумант метода
        if (index < this.data.length) {
            this.data[index] = data;
            return;
        }

        Data[] newData = new Data[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        newData[index] = data;
        this.data = newData;
    }

    public static void main(String[] args) throws IllegalAccessException {
        FileSystemDataProvider dataProvider = new FileSystemDataProvider();
        dataProvider.paths = new String[10];

        for (int i = 0; i < 55; i++) {
            dataProvider.addPath(i, "Path - " + (i + 1));
        }
        for (String path : dataProvider.paths) {
            System.out.println(path);
        }
    }
}
