package session.enums;

public enum Team {
    TERRORIST("Террорист") {
        @Override
        public void sayHello() {
            System.out.println("Хай террор");
        }
    },
    COUNTER_TERRORIST("Контра") {
        @Override
        public void sayHello() {
            System.out.println("Привет");
        }
    };

    private final String name;

    Team(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
