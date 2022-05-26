//6.	Write a program to enter radius of a circle and find its diameter, circumference and area.
 /*
Formula:                                   where:  r = radius of the circle
D = 2 * r                                          D = diameter of the circle
C = 2 * PI * r                                     C = circumference of the circle
A = PI * r^2                                       A = area of the circle
--> PI = 3.14
*/
package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args){
        float r,diameter,circumference,area;
        float pi= 3.14f ;
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        r = radius.nextFloat();
        System.out.println("________________________________________");
        diameter=2*(r);
        circumference = 2*pi*r;
        area = pi*(r*r);
        System.out.println("Diameter of circle is : " +diameter + " units");
        System.out.println("Circumference of circle is : " +circumference + " units");
        System.out.println("Area of circle is : " + area + " sq. units");
        System.out.println("________________________________________");
    }
}
