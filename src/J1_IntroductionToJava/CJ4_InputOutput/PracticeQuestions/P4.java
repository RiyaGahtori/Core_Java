//4.	Write a program to enter length and breadth of a rectangle and find its perimeter.

/*A rectangle has four sides in which sides opposite to each other are equal. The perimeter of the rectangle is the area around its outside.
Suppose a, b, c, d are the four sides of rectangle [a=c and b=d]
Perimeter Of Rectangle= a+ b+ c+ d= a+ b+ a+ b= 2(a + b).*/

package J1_IntroductionToJava.CJ4_InputOutput.PracticeQuestions;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args){
        int l, b, perimeter;
        Scanner lb = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        l = lb.nextInt();
        System.out.print("Enter the breadth of rectangle : ");
        b = lb.nextInt();
        System.out.println("--------------------------------");
        perimeter  = 2*(l+b);
        System.out.println("Perimeter of Rectangle is: " +perimeter);
        System.out.println("--------------------------------");
    }
}
