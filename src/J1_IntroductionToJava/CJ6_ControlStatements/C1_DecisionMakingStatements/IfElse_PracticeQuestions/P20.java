/*
20. Write a program to accept a grade and declare the equivalent description :
Grade	     Description
E	         Excellent
V	         Very Good
G	         Good
A	         Average
F	         Fail
Test Data :
Input the grade : A
Expected Output :
You have chosen : Average
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P20 {
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the grade : ");
        char grade = r.next().charAt(0);
        System.out.println(" ");

        if (grade == 'E')
        {
            System.out.println("Your Performance is Excellent");
            System.out.println("You have immense potential to create wonders in life! Wishing you the very best for all your upcoming endeavors!");
        }
        else if (grade == 'V')
        {
            System.out.println("Your Performance is Very Good");
            System.out.println("Keep Working ! Best wishes to you.");
        }
        else if (grade == 'G')
        {
            System.out.println("Your Performance is Good");
            System.out.println("Your hard work is bound to result in prosperity and fortune. Good luck for a successful life ahead!");
        }
        else if (grade == 'A')
        {
            System.out.println("Your Performance is Average");
            System.out.println("Your hard work will never go in vain! Be diligent towards your dreams and you will reach there soon enough!");
        }
        else if (grade == 'F')
        {
            System.out.println("You are Fail");
            System.out.println("Victories teach you to be humble, but mistakes make you more skillful. So just do your best!");
        }
        else
        {
            System.out.println("Error! ");
            System.out.println("Invalid Grade Found");
        }
    }
}
