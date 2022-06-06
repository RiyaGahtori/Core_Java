/*
4. Write a program to find whether a given year is a leap year or not.
Test Data : 2016
Expected Output : 2016 is a leap year.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P4
{
    public static void main(String[] args)
    {
        Scanner ly = new Scanner(System.in);
        System.out.print("Enter the year you want to check : ");
        int year = ly.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}
