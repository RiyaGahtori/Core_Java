/*
24. Write a program to read any Month Number in integer and display the number of days for this month.
Test Data : 7
Expected Output : Month have 31 days
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Month Number : ");
        int month = num.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("This Month have 31 days.");
        }
        else if(month == 2)
        {
            System.out.println("The 2nd month is a February and have 28 days.");
            System.out.println("In Leap year The February month have 29 days.");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("This Month have 30 days.");
        }
        else
        {
            System.out.println("Invalid Month Number");
        }
    }
}
