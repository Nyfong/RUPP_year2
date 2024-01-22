package w1;
import  java.util.*;
class Assign1 {
    public static void main( String[] args)
    {
    Scanner Scan = new Scanner(System.in);
    System.out.println("Exercise 01");   // Print output//
    int sum=0;
    do
     {
     System.out.print("Enter the number");
     int i = Scan.nextInt();
     sum+=i;
     }while(sum!= 50 && sum<50);
     if (sum>50)
     {
     System.out.println("MAXIMUN only 50!");
     System.out.println("you have enter:"+ sum);
     } else if (sum==50)
     {
     System.out.println("you have enter:"+ sum);
     } 
    Scan.close();
    }
}