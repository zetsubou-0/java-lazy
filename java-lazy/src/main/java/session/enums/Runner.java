package session.enums;

public class Runner {

    public static void main(String[] args) {
//        for (City city : City.values()) {
//            System.out.println(city.getName() + "\t\t" + city.getYear());
//        }
//
//        System.out.println(City.MISNK.getName());

//        System.out.println(City.valueOf("GOMEL"));
        // Exception in thread "main" java.lang.IllegalArgumentException:
        // No enum constant session.enums.City.Гомель

//        City city = City.of(1141);
//        System.out.println(city.getName());

        Xxx xxx = new Xxx() {
            @Override
            public String get() {
                return "xXx";
            }

            @Override
            public void print() {

            }
        };

        Team.TERRORIST.sayHello();
        Team.COUNTER_TERRORIST.sayHello();
    }
}
