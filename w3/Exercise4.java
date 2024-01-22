package w3;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scanner.next();
        // Convert to Uppercase
        word = word.toUpperCase();
        int i = 0;
        int j = word.length() - 1;
        // comparing characters from both ends
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                System.out.println("Not a palindrome");
                break; // Exit the program if not a palindrome
            }
            i++;
            j--;
        }
        System.out.println( "  The word is a palindrome");
        scanner.close();
    }
}
