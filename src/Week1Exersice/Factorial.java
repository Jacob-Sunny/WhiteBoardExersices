package Week1Exersice;
// write a method that calculates the factorial of a given number
// Example: 5 = 5 X 4 X 3 X 2 X 1
public class Factorial {
    public static void main(String[] args) {

        int test1 = 5;
        int test2 = 4;
        int results = factorial(test1);
        int results2 = factorial2(test2);
        System.out.println(results);
        System.out.println(results2);
    }

    // method that returns the factorial value of the number being passed in
    public static int factorial(int n){
        int factorial = n;
        for(int i = n-1; i>0; i--){
            factorial = factorial * i;
        }
        return factorial;
    }

    // recursive method to return the value of the factorial
    public static int factorial2(int n){
        if(n==0){
            return 1;
        }
        else{
            return(n*factorial2(n-1));
        }
    }
}
