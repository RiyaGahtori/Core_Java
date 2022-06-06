/*
14. Write a program to check whether a triangle is Equilateral, Isosceles or Scalene.
Test Data : 50 50 60
Expected Output : This is an isosceles triangle.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of Triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Check for equilateral triangle
        if (a == b && b == c )
            System.out.println("This is an Equilateral Triangle");

            // Check for isosceles triangle
        else if (a == b || b == c || c == a )
            System.out.println("This is an Isosceles Triangle");

            // Otherwise scalene triangle
        else
            System.out.println("This is an Scalene Triangle");

    }
}
