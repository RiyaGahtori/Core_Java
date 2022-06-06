/*
7. Write a program to accept the height of a person in centimeter and categorize the person according to their height.
Test Data : 135
Expected Output :
The person is Dwarf.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P7
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter You height in centimeter : " );
        int height = sc.nextInt();

        if(height >= 175)
        {
            System.out.println("You are beautiful and tall");
        }
        else if(height > 155)
        {
            System.out.println("Your height is average");
        }
        else
        {
            System.out.println("You are cute and short");
        }
        System.out.println(" ");
        System.out.println(" Thank You! ");
        System.out.println("Have a glorious day and a blessed week!");
    }
}
