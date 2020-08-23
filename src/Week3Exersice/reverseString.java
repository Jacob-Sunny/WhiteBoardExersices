package Week3Exersice;
//Reverse string without .reverse() method.
public class reverseString {
    public static void main(String[] args) {
        String string1 = "Hello World!";

        System.out.println(reverseString(string1));


    }

    public static String reverseString(String s){
        if(s.length()==0){
            return "";
        }
        return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
    }
}
