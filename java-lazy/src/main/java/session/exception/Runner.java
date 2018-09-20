package session.exception;

import java.io.FileNotFoundException;

public class Runner {

    /**
     * FileUtil.open -> создает новый файл (FileUtil.File), если нет - выбрасывает FileNotFoundException
     * FileUtil.File имеет нестатически метод close()
     */
    public static void main(String[] args) {
        FileUtil.File file = null;
        try {
            file = FileUtil.open("D:/111.html");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace(System.err);
        } finally {
            file.close();
        }


        System.out.println("Finish");
    }

    public static void print() throws Exception {
        System.out.println("!!!!");
    }

    public static void chinko() throws ChinkoNotFoundException {
    }
}
