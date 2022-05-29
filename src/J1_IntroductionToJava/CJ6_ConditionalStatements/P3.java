/*
3. Write a program to check whether a given number is positive or negative.
Test Data : 21
Expected Output : 21 is a positive number
*/

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P3
{
    public static void main(String[] args)
    {
        Scanner pn = new Scanner(System.in);
        //number to be checked
        System.out.print("Enter the number you want to check : ");
        int num = pn.nextInt();

        //checks the number is greater than 0 or not
        if(num > 0)
        {
            System.out.println(num +" is a positive number");
        }

        //checks the number is less than 0 or not
        else if(num<0)
        {
            System.out.println(num + " is a negative number");
        }

        //executes when the above two conditions return false
        else
        {
            System.out.println(num + " is neither a positive number nor a negative number ");
        }
    }
}
