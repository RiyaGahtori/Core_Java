/*
25. Write a program which is a Menu-Driven Program to compute the area of the various geometrical shape.
Test Data :
1
5
Expected Output :
The area is : 78.5
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P25
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("__________________________________");
        System.out.println(" Press 1 for Area of Circle ");
        System.out.println(" Press 2 for Area of Rectangle ");
        System.out.println(" Press 3 for Area of Triangle ");
        System.out.println("__________________________________");
        System.out.print("Your Choice : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius of the Circle : ");
            int radius = sc.nextInt();
            float area = (float) (3.14 * radius * radius);
            System.out.println("The area of the Circle is : " + area);
        } else if (choice == 2) {
            System.out.print("Enter length of the Rectangle : ");
            int length = sc.nextInt();
            System.out.print("Enter width of the Rectangle : ");
            int width = sc.nextInt();
            float area = length * width;
            System.out.println("The area of the Rectangle is : " + area);
        } else if (choice == 3) {
            System.out.print("Enter the base of the Triangle : ");
            int base = sc.nextInt();
            System.out.print("Enter the height of the Triangle : ");
            int height = sc.nextInt();
            float area = (float) (0.5 * base * height);
            System.out.println("The area of the Triangle is : " + area);
        } else {
            System.out.println("Error!");
            System.out.println("Invalid choice");
        }
    }
}

