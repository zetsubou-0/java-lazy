package session.base;

public class Session4 {

    public static void main(String[] args) {
        final ExceptionExample exceptionExample = new ExceptionExample();
//        exceptionExample.throwEx("qwe");

//        try (InputStream in = new FileInputStream("")) {
//            print();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println();
//        }

        getSomething();
    }

    public static void print() throws Exception {
        TestService testService = new TestServiceImpl();
        testService.test();
    }

    public static String getSomething() {
        try {
            System.exit(0);
            return getName();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
        return null;
    }

    public static String getName() throws Exception {
        return "Neko";
    }
}

class ExceptionExample {

    public void throwEx(String name) throws IllegalArgumentException {
        System.out.println("Hello " + name);
        throw new IllegalArgumentException("Atata");
    }
}

interface TestService {
    void test() throws Exception;
}

class TestServiceImpl implements TestService {

    @Override
    public void test() throws Exception {
        throw new Exception("Atata");
    }
}