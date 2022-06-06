/*
21. Write a program to read any day number in integer and display day name in the word.
Test Data : 4
Expected Output : Thursday
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P21 {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Day Number : ");
            int day = sc.nextInt();

            if(day == 1)
            {
                System.out.println("Monday");
            }
            else if(day == 2)
            {
                System.out.println("Tuesday");
            }
            else if(day == 3)
            {
                System.out.println("Wednesday");
            }
            else if(day == 4)
            {
                System.out.println("Thursday");
            }
            else if(day == 5)
            {
                System.out.println("Friday");
            }
            else if(day == 6)
            {
                System.out.println("Saturday");
            }
            else if(day == 7)
            {
                System.out.println("Sunday");
            }
            else
            {
                System.out.println("Invalid Number.");
            }

        }


}
