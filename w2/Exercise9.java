
package w2;
public class Exercise9 {
 public static void main (String[] args)
 {
  //write a program that calculate the following summation
  Double numberator =1.0, result=0.0;
  int denomenator_left =1;
  int denomenator_right= 2;
  while (denomenator_left !=625 && denomenator_right!=626)  // denomenator_left -1 = 624 and the denomator_right-1 - 625//
  {
   result += (numberator/( Math.sqrt(denomenator_left)+ Math.sqrt(denomenator_right)));
   denomenator_left++;
   denomenator_right++;
  }
  //print the final result
  System.out.println("This is the final answer="+ result);
 }
}
