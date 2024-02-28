import java.util.Scanner;

public class Square{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
int a, area, perimeter;

System.out.println(" Enter the lenght of side ");
a = scan.nextInt();

area = a*a;
perimeter = 4*a;

System.out.println("The area of square is: "+area);
System.out.println("The perimeter of square is: "+perimeter);

}
}