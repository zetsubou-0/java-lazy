package solution.andrei;
public class Task2 {
    public static void main (String[] args){
        double number = 12.5;
        System.out.println(translation(number));
        int value = 5;
        System.out.print(answer(value));
        System.out.print(mood(value));

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
}
