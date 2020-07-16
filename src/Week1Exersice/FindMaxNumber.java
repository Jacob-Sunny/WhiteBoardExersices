package Week1Exersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] list = new int[]{10, 2, 88, 22, 54};
        int[] list2 = new int[]{1, 29, 58, 92, 34};

        int value = maximum(list);
        int value2 = maximum2(list2);
        System.out.println(value);
        System.out.println(value2);
    }


    public static int maximum(int [] list){
        List<Integer> newlist = new ArrayList<Integer>();
        for(int i = 0; i < list.length;i++){
            newlist.add(list[i]);
        }
        return Collections.max(newlist);
    }

    // method that returns the max value in the list using streams
    public static int maximum2(int [] list){
        int max = Arrays.stream(list).max().getAsInt();
        return max;
    }

}
