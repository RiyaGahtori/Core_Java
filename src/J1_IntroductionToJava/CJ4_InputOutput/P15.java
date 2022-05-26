//15.	Write a program to calculate area of an equilateral triangle.
/*
A triangle is having all angles of 60 degrees and congruent sides is called Equilateral Triangle.
Area of Equilateral Triangle = (1.73 * a* a)/4
Where: a = side
 */

package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner;

public class P15 {
    public static void main(String[] args){
        float a;
        double area;
        Scanner side = new Scanner(System.in);
        System.out.print("Enter side of Triangle : ");
        a = side.nextFloat();
        System.out.println("_________________________________");
        area = (1.73*a*a)/4;
        System.out.println("Area of Equilateral Triangle is : "+area);
        System.out.println("_________________________________");
    }
}
