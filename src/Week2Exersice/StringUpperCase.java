package Week2Exersice;
// write a method that converts all strings in a list to their upper case.
// using Lambdas and Streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("laptop");
        myList.add("world");

        System.out.println(upperCase(myList));
    }

    public static List<String> upperCase(List<String> list){

        // conversion of the list to a stream and mapping the values in that stream and converting into to type String
        // . collect - collects the results of the stream and puts it back as a list.
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
