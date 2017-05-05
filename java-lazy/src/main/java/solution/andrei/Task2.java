package solution.andrei;
public class Task2 {
    public static void main (String[] args){

        double number = 12.5;
        System.out.println(translation(number));

        int value = 5;
        System.out.println(answer(value));

        long value2 = 6;
        System.out.println(mood(value2));

        System.out.println(mood((int)value2));

        String s1 = "start ";
        String s2 = "stop";
        line(s1,s2);
    }

    private static double translation (double number){
        return number / 100;
    }

    private static boolean answer (int value){
        if (value >= 0){
            return true;
        }else {
            return false;
        }
    }

    private static String mood (long value ){
        if (value > 0){
            return "positive";
        }
        if (value < 0){
            return "negative";
        }else {
            return "zero";
        }
    }

    private static String mood (int val){
        return mood((long)val);
    }

    private static void line (String start, String stop){
        System.out.print(start);
        int a = -100;
        int b = 230;
        int i = a;
        while (i <= b ) {
            System.out.print(i + " ");
            i++;
        }
        while (i >= b) {
            System.out.print(i + " ");
            i--;
        }
        System.out.print(stop);
    }
}
