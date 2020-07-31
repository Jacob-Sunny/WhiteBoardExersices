package Week2Exersice;
//Write a method that returns the average of a list of integers.


import java.util.ArrayList;
import java.util.List;

public class AverageValue {

    public static void main(String[] args) {

        // List of Integer deceleration
        List<Integer> myList = new ArrayList<>();
        //adding items to the list
        myList.add(100);
        myList.add(76);
        myList.add(89);
        myList.add(65);
        myList.add(81);

    double Average = average(myList);

    System.out.println(Average);

    }

    public static double average(List<Integer> list){

        int num = 0;
        for (int i =0; i <list.size();i++){
          //System.out.println(list.get(i));
          num = num + list.get(i);
        }
        //casting num to a double
        return (double)num/list.size();
    }
}
