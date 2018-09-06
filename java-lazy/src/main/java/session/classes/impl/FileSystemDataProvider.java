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
//        int count = 10;
//        String[] paths = new String[count];
//        for (int i = 0; i < paths.length; i++) {
//            if (i < paths.length) {
//                paths[index] = path;
//            }
//            if (i == paths.length - 1) {
//                String[] newPaths = new String[count * 2];
//                newPaths = paths;
//            }
//        }



    }

    public void addData(int index, Data data) {

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
