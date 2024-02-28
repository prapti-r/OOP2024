import java.util.Scanner;

public class Fraction{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
int nume, deno;

System.out.println(" Enter the numerator  ");
nume = scan.nextInt();

System.out.println(" Enter the denominator  ");
deno = scan.nextInt();

float deci = nume / deno;

System.out.println("The decimal equivalent is: " + String.format("%.5f",deci));

}
}