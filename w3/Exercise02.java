package w3;
import java.util.Scanner;
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word with both uppercase and lowercase characters:");
        String inputWord = scanner.nextLine();
        String modifiedWord = Exercise2(inputWord);
        System.out.println("Modified Word: " + modifiedWord);
        scanner.close();
    }
    public static String Exercise2(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (i > 0 && Character.isUpperCase(currentChar)) {
                result.append(' '); // Insert space before uppercase letters (except the first one)
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}
