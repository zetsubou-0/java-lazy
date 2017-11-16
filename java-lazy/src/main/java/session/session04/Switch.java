package session.session04;

public class Switch {
    /*
    switch(выражение){
        case значение 1:
            операторы
            break;
        case значение 2:
            операторы
            break;
        default:
            операторы
    }
    вместо выражения можно подставлять простые типы(до JDK7) и Enum, String(c JDK7 включительно)

    */
    public static void main(String[] args) {
        int number = (int)Math.round(Math.random()*10);
        switch (number){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("Other number " + number);
        }
    }
}
