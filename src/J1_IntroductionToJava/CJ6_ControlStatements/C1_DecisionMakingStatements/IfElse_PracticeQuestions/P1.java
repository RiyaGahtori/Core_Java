/*
1. Write a program to accept two integers and check whether they are equal or not.
Test Data : 21 21
Expected Output : Number1 and Number2 are equal
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args)
    {
        Scanner num12 = new Scanner(System.in);
        System.out.print("Enter The First number : ");
        int Number1 = num12.nextInt();
        System.out.print("Enter The Second number : ");
        int Number2 = num12.nextInt();

        if(Number1 == Number2)
        {
            System.out.println("Number1 and Number2 are equal ");
        }
        else
        {
            System.out.println("Number1 and Number2 are not equal");
        }

    }
}
