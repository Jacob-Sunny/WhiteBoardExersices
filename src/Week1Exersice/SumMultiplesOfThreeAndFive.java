package Week1Exersice;
//Given a number n, write a method that sums all multiples of three and five up to n(inclusive)
public class SumMultiplesOfThreeAndFive {
    public static void main(String[] args) {
       // test case values
        int test1 = 5;
        int test2 = 6;
        int test3 = 7;
        int test4 = 8;
        int test5 = 9;
        int test6 = 10;
        int test7 = 15;
        // test case results
        int result1 = sum(test1);
        int result2 = sum(test2);
        int result3 = sum(test3);
        int result4 = sum(test4);
        int result5 = sum(test5);
        int result6 = sum(test6);
        int result7 = sum(test7);
        //PrintOutStatements
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
    }
    // method that takes in one parameter and return a number back
    public static int sum(int n){
        int sum = 0;
        for(int i =0; i <=n; i++){
            if(i % 3 ==0 || i % 5==0){
                //sum is incremented by i if i is a multiple of 3 or 5
                sum = sum + i;
            }
        }
        //returns the value of sum
        return sum;
    }
}
