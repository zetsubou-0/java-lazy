package solution.andrei.collections.List;


import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        for (Integer s : list) {
            System.out.println(s);
        }

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1000);
        list1.add(1111);
        list1.add(2222);
        list1.add(3333);

        List<Integer> list2 = new ArrayList<Integer>(list1);
        list2.add(1,1);
        list2.add(1,3);
        list2.add(2,5);
        list2.add(3,6);
        for (Integer s : list2) {
            System.out.println(s);
        }
    }

}
