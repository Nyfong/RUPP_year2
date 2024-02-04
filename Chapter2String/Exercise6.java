package Chapter2String;
public class Exercise6 {
    public static void main(String[] args) {
        String input = "RUPP Kh";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
    public static String removeDuplicates(String str) {
       // str = str.toLowerCase(); // convert to lowercase
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the current character is already present in the result string
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                //So, if the indexOf() method returns -1, it means that the currentChar is not present in the result string.
                //If the condition result.indexOf(String.valueOf(currentChar)) == -1 evaluates to true, it means that the currentChar is not present in the result string.
                result.append(currentChar);
            }
        }
        return result.toString();
    }

}