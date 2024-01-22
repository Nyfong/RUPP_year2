package w2;

import java.util.Scanner;
public class Exercise06 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int posCount = 0;
        int negCount = 0;
        int total = 0;
        int count = 0;
        System.out.println("Enter integers (enter 0 to stop):");
        // Loop to read input integers
        while (true) {
            int num = scanner.nextInt();
            // Check if the entered number is zero to stop the loop
            if (num == 0) {
                break;
            }
            // Increment counts based on positive or negative values
            if (num > 0) {
                posCount++;
            } else if (num < 0) {
                negCount++;
            }
            // Increment total and count (excluding zeros)
            if (num != 0) {
                total += num;
                count++;
            }
        }
        // Calculate average  ternary condition  
        double average = (count > 0) ? (double) total / count : 0;
        // Display results
        System.out.println("Total positive integers: " + posCount);
        System.out.println("Total negative integers: " + negCount);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        scanner.close();
    }
    
}
