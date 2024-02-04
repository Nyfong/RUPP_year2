package Chapter2String;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String capitalizedSentence = capitalizeFirstLetter(sentence);
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
        scanner.close();
    }
    public static String capitalizeFirstLetter(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        //The split() method takes a regular expression as its argument. In this case, the regular expression is " ",
        // which specifies that the method should split the string wherever it encounters a space character
        //After splitting, the substrings are stored in an array of strings named words. Each element of the array represents a word from the original sentence.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            // Capitalize the first character of each word and make the rest lowercase
            String word = words[i];
            if (!word.isEmpty()) {
                //substring(int beginIndex, int endIndex) formula
                String firstLetter = word.substring(0, 1).toUpperCase();   //index 0is uppercase
                String restOfWord = word.substring(1).toLowerCase();  //index 1 or  starting from the second character and converts it to lowercase.
                result.append(firstLetter).append(restOfWord); //This line effectively constructs the word with the first letter capitalized and the rest of the letters in lowercase and appends it to the StringBuilder object result.
                // This process repeats for each word in the sentence, ultimately constructing the fully capitalized sentence.
            }
            // Add a space between words, except for the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
