package session02;

public class Array {

    public static void main(String[] args) {

        String[] words = new String[4];

        words[2] = "be "    ;
        words[0] = "I";
        words[1] = "'ll ";
        words[3] = "back";

        System.out.print(words[0]);
        System.out.print(words[1]);
        System.out.print(words[2]);
        System.out.println(words[3]);

        words = new String[] {"I", "ll ", "be ", "back", "!!!", "chinko"};
        System.out.println(words.length);
        System.out.print(words[0]);
        System.out.print(words[1]);
        System.out.print(words[2]);
        System.out.print(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
    }
}
