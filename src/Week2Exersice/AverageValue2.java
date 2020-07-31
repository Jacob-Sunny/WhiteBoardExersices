package Week2Exersice;

//Write a method that returns the average of a list of integers.
// USING Lambdas And Streams

import java.util.ArrayList;
import java.util.List;

public class AverageValue2 {
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

        // mapping to return a stream consisting of the results
        return list.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
