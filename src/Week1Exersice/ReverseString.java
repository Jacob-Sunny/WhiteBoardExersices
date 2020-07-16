package Week1Exersice;
// write a method that returns a string in reverse
public class ReverseString {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String results = reverse(sentence);
        System.out.println(results);
    }
    public static String reverse(String string){
        StringBuffer s = new StringBuffer(string);
        s.reverse();

        return s.toString();
    }
}
