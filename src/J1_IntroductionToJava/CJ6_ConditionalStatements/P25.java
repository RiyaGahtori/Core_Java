/*
25. Write a program which is a Menu-Driven Program to compute the area of the various geometrical shape.
Test Data :
1
5
Expected Output :
The area is : 78.5
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P25
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Press 1 for Area of Circle ");
        System.out.println(" Press 2 for Area of Rectangle ");
        System.out.println(" Press 3 for Area of Triangle ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius of the Circle : ");
            int radius = sc.nextInt();
            float area = (float) (3.14 * radius * radius);
            System.out.println("The area of the Circle is : " + area);
        } else if (choice == 2) {
            System.out.print("Enter length and width of the Rectangle : ");
            int length = sc.nextInt();
            int width = sc.nextInt();
            float area = length * width;
            System.out.println("The area of the Rectangle is : " + area);
        } else if (choice == 3) {
            System.out.print("Enter the base and height of the Triangle : ");
            int base = sc.nextInt();
            int height = sc.nextInt();
            float area = (float) (0.5 * base * height);
            System.out.println("The area of the Triangle is : " + area);
        } else {
            System.out.println("Error!");
            System.out.println("Invalid choice");
        }
    }
}

