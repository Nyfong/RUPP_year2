package w3;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter the sentence:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result;
        result = removeConsonants(input);
        System.out.println(result);
        scan.close();
    }
    //Function that i return StringType// 
    public static String removeConsonants(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); 
            if (isVowel(c)) { 
                sb.append(c);   // append like extend the single charater to sentence ;-;//
            }
        }
        return sb.toString();
    }
    //Function that i return Vowel checking// 
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}