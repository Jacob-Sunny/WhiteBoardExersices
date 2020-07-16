package Week1Exersice;
// Write a method that sums two numbers
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        //Declarations of type integer
        int num1 = 20;
        int num2 = 7;

        //Declaration of an int value that takes the value of the returned value of the sum method
       int results = sum(num1,num2);
       //Printout statement
       System.out.println(results);

    }

    public static int sum(int i, int j){
        return i + j;
    }
}