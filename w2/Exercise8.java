package w2;
class Exercise8{
    public static void main(String[] args)
    {
      Double denomenator=3.0, numberator=1.0, result=0.0;
      //(Sum a seeries) Write a program to sum a series // 
      while (numberator !=99 && denomenator!=101) // numberator -2 =97 and denomenator-2 = 99//
      {
       result += (numberator / denomenator);
       numberator= numberator+2;
       denomenator= denomenator+2;
      }
      System.out.println("The final resualt is "+ result);
    }
}
