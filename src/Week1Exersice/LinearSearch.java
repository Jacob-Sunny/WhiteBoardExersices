package Week1Exersice;

import java.util.Objects;

//Write a method that returns the index of the first occurrence of given integer in a list.
public class LinearSearch {
    public static void main(String[] args) {
        // int test num
        int testNum = 10;
        // list of integers
        int [] testList = {4,7,9,3,10,12,34,77};
        // int value that returns the index location of the list
        int result = search(testNum,testList);
        //Print statement
        System.out.println(result);
    }
    // static method that takes in an int and a list as parameters
    public static int search(int n, int[] list){
       //set index to -1 in case if number is not in the list
        int index = -1;
        // for loop to check if the number is in the list
        for(int i =0; i < list.length; i++){
            // if the number exists in the list, a new value is set to index and the foor loop is stopped with the break statement
            if(Objects.equals(list[i], n)){
                index =i;
                break;
            }
        }
        // returning the index of the number
        // if number is not found, index is -1
        return index;
    }
}


