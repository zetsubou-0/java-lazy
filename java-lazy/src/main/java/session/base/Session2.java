package session.base;

import java.util.ArrayList;
import java.util.List;

public class Session2 {

    private volatile transient String x = null;

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        cat2.name = "neko";
        Dog dog = new Session2().new Dog();
        System.out.println(cat.name);
        System.out.println(cat2.name);
        Builder builder = new AbstractBuilder() {
            @Override
            protected String suffix() {
                return "213";
            }
        };

        System.out.println(builder.build(123));

        List<String> list = new ArrayList<String>() {
            @Override
            public boolean add(String s) {
                return super.add(s + "-" + s);
            }
        };
        list.add("qwe");
        list.add("zxc");
        System.out.println(list);
    }

    private void test() {
        Cat cat = new Cat();
        Dog dog = new Dog();
    }

    public interface Animal {
        String name = "qwe";
        String getName();
    }

    public static class Cat extends CoolAnimal {
        public static String name = "cat";

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getCoolName() {
            return null;
        }
    }

    public class Dog extends CoolAnimal {
        private String y = null;

        private void print() {
            x = "qwe";
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getCoolName() {
            return null;
        }
    }

    public static abstract class CoolAnimal implements Animal {
        public abstract String getCoolName();
    }

    public interface Builder {
        String build();
        String build(int x);
    }

    public static abstract class AbstractBuilder implements Builder {
        @Override
        public String build() {
            return "qwe" + suffix();
        }

        @Override
        public String build(int x) {
            return x + suffix();
        }

        protected abstract String suffix();
    }
}
