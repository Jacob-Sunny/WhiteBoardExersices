package Week2Exersice;
//Write a method that returns "Fizz" for multiplies of 3 and "Buzz" for multiplies of 5
// If the number is both a multiple of 3 and 5 return FIZZBUZZ
// If the number is not a multiple of either number return the number

public class FizzBuzz {

    public static void main(String[] args) {

     System.out.println(fizzBuzz(5));
     System.out.println(fizzBuzz(3));
     System.out.println(fizzBuzz(15));
     System.out.println(fizzBuzz(7));

    }

    public static String fizzBuzz(Integer i){
        String results = "";
        if(i%3 ==0){
            results += "Fizz";
        }
        if(i%5==0){
            results += "Buzz";
        }
        if(results.equals("")){
            results = i.toString();
        }
        return results;
    }


}
