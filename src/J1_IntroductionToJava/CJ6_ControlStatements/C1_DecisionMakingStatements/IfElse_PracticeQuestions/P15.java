/*
15. Write a program to check whether a triangle can be formed by the given value for the angles.
Test Data : 40 55 65
Expected Output : The triangle is not valid.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three angles of triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calculate the sum of all angles of triangle
        int sum = a + b + c;

        // Check whether sum=180 then it's a valid triangle otherwise not
        if(sum == 180)
        {
            System.out.println("The Triangle is valid.");
        }
        else
        {
            System.out.println("The Triangle is not valid.");
        }

    }
}
