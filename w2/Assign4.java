package w1;
import java.util.*;
public class Assign4 {
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int computer_number = 50;
        int min = 1, guess=0, rand=0;
        int range = computer_number - min + 1;
        //taking from user
        do
        {
        System.out.println("Enter the guessing number:");
        guess = scan.nextInt();
         // generate random numbers within 1 to 50
        rand = (int)(Math.random() * range) + min;
        //using ternary oparetor//
        String result = ( guess > rand) ?"Too high"
        :( guess < rand)?"To low"
        :( guess == rand)?"Well done it's "+rand+"":"";
        //print the result
        System.out.println(result);
        System.out.println("It's "+ rand);
        } while( guess != rand);    
        scan.close();
    }
    
}
