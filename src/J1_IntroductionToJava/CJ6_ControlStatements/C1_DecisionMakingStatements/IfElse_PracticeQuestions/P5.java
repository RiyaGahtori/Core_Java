/*
5. Write a program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.
Test Data : 21
Expected Output : Congratulation! You are eligible for casting your vote.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P5
{
    public static void main(String[] args)
    {
        Scanner candidate = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name=candidate.nextLine();
        System.out.print("Enter your age : ");
        int age = candidate.nextInt();
        if((age>=18)&&(age<=100))
        {
            System.out.println("Congratulation! "+name+" You are eligible for casting your vote.");
        }
        else
        {
            System.out.println("Sorry! "+name+", You are not eligible for voting");
        }
        System.out.println("Thank You!" );
        System.out.println("Have a nice Day");
    }
}
