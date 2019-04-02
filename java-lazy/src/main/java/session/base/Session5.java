package session.base;

public class Session5 {

    public static void main(String[] args) {
        Season.SPRING.nya();
        Season.SUMMER.nya();

        Season.valueOf("WINTER").nya();

        for (Season season : Season.values()) {
            System.out.println(season.toString());
        }

        System.out.println(Season.getSeasonByMonth(1));
    }
}

interface Neko {
    void nya();
}

enum Season {
    SPRING(3, 5) {
        @Override
        public void nya() {
            System.out.println("qwe " + getStart());
        }
    },
    WINTER(12, 2) {
        @Override
        public void nya() {
            System.out.println("asd " + getStart());
        }
    },
    SUMMER(6, 8) {
        @Override
        public void nya() {
            System.out.println("zxc " + getStart());
        }
    },
    AUTUMN(9, 11) {
        @Override
        public void nya() {
            System.out.println("qqq " + getStart());
        }
    },
    UNDEFINED(0, 0) {
        @Override
        void nya() {
            System.out.println("Undefined ((");
        }
    };

    private final int start;
    private final int end;

    Season(int start, int end) {
        this.start = start;
        this.end = end;
    }

    abstract void nya();

    int getStart() {
        return start;
    }

    int getEnd() {
        return end;
    }

    public static Season getSeasonByMonth(int month) {
        for (Season season : Season.values()) {
            if (season.getStart() == month || season.getEnd() == month) {
                return season;
            }
        }
        return UNDEFINED;
    }
}