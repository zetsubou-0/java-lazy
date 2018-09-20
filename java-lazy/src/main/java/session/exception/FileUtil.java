package session.exception;

import java.io.FileNotFoundException;

public class FileUtil {

    public static File open(String path) throws FileNotFoundException {
        final File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found exception");
        }
        return file;
    }


    public static class File extends java.io.File implements AutoCloseable {
        private File(String pathname) {
            super(pathname);
        }

        public void close() {
            System.out.println("close");
        }
    }
}
