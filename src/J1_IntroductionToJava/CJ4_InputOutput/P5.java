//5.	Write a program to enter length and breadth of a rectangle and find its area.
/*Area of a rectangle is the amount of space occupied by the rectangle. Area of a rectangle is the number of square units takes to fill a rectangle completely.
Formula :
area = length * breadth
 */

package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner;

public class P5 {
 public static void main(String[] args){
  int l, b, area;
  Scanner lb = new Scanner(System.in);
  System.out.print("Enter the length of rectangle : ");
  l = lb.nextInt();
  System.out.print("Enter the breadth of rectangle : ");
  b = lb.nextInt();
  System.out.println("________________________________");
  area = l*b;
  System.out.println("Area of rectangle is : " +area);
  System.out.println("________________________________");
 }
}
