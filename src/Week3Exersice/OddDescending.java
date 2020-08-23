package Week3Exersice;

import java.util.Scanner;

//Write  a program to print odd numbers from 1 to 50 in Descending order.
public class OddDescending {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();

        for(int i = num; i >= 0; i-- ){
            if(1%2 !=0){
                int oddNum = i;
                System.out.println(oddNum + "");
            }
        }

    }

}
