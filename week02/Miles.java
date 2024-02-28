
import java.util.Scanner;

public class Miles
{
   public static void main(String[] args)
   {
      float miles;
      double km;
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the number of miles: ");
      miles = scan.nextFloat();

      km = miles * 1.60935;

      System.out.println(miles +" Miles is equal to "+ km +" kilometers");
   }
}
		

 