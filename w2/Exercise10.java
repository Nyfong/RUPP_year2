package w2;
public class Exercise10 {
    public static void main(String a[]) {
        int limit = 10000;
        int count = 0;
        System.out.println("Perfect numbers less than " + limit + ":");
        for (int num = 1; num <= limit; num++) {
            int sum = 0;
            // Find divisors and add them to the sum
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            // Check if the number is perfect
            if (sum == num) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("Total perfect numbers found: " + count);
    }
}
