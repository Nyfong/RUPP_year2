package  Chapter2String;
import java.util.Scanner;
public class Exercise10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int wordCount = countWords(sentence);
        int consonantCount = countConsonants(sentence);
        int vowelCount = countVowels(sentence);
        int digitCount = countDigits(sentence);
        int specialCharCount = countSpecialCharacters(sentence);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");   //The trim() method is called on the sentence variable.
        // It removes leading and trailing whitespace from the sentence. This step ensures that any extra spaces before or after the sentence are removed.
        //The \\ is used to escape the special meaning of \ in regular expressions, and s+ represents one or more occurrences of whitespace characters (spaces, tabs, etc.).
        return words.length;
    }
// function of the Count Consonants
    private static int countConsonants(String sentence) {
        int count = 0;
        //each loop
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c) && !isVowel(Character.toLowerCase(c))) {
                count++;
            }
        }
        return count;
    }
    // function of finding vowel
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // function of the Count Vowel
    public static int countVowels(String sentence) {
        int count = 0;
        //each loop
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c) && isVowel(Character.toLowerCase(c))) {
                count++;
            }
        }
        return count;
    }
   //function of the count Digit
    public static int countDigits(String sentence) {
        int count = 0;
        //each loop
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
// function of the count SpecailCharacter
   public static int countSpecialCharacters(String sentence) {
        int count = 0;
        //each loop
        for (char c : sentence.toCharArray()) {
            if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
                count++;
            }
        }
        return count;
    }
}