package w2;

public class Exercise07 {
    public static void main(String[] args) {
        int NUMBERS_PER_LINE = 10; // Display 10 numbers per line
        int count = 0; // Count the number of numbers divisible by 5 and 6

        // Test all numbers from 100 to 200
        for (int i = 100; i <= 200; i++) {
            // Test if number is divisible by 5 and 6
            if (i % 5 == 0 || i % 6 == 0) {
                count++; // increment count
                // Test if numbers per line is 10
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
    
}
