package w3;
public class Exercise01 {
    public static void main(String[] args) {
        String First = "abz"; //specific on small alphabet//
        String Final = "";  
        //for each loop//
        for (char c : First.toCharArray()) {  // toCharArray == convert string to an array of characters. //
           Final += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
        }
        System.out.println(Final);
    }
}
//noted (;-;)//
/*(c - 'a' + 1) subtracts the ASCII value of the character 'a' 
from the ASCII value of the character c. This effectively maps 
the character c to a value between 0 and 25, representing its 
position in the English alphabet (where 'a' is 0, 'b' is 1, and so on). */
//Character.toString(...) converts the character obtained in 
//back into a string representation.