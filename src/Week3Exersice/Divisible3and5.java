package Week3Exersice;
// Write  a program to print  numbers which are divisible by 3,5 and 3 and 5.
public class Divisible3and5 {
    public static void main(String[] args) {
        int num = 3;
        int num2 = 5;
        int num3 =15;

        if(num%3==0){
            System.out.println("The number is divisible by 3" + ":" + num);
        }

        if(num2%5==0){

            System.out.println("The number is divisible by 5" + ":" + num2);
        }

        if(num3%3==0 && num3%5==0){
            System.out.println("The number is divisble by 3 and 5" + ":" + num3);
        }
    }
}
