/*
2. Write a program to check whether a given number is even or odd.
Test Data : 21
Expected Output : 21 is an odd integer
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P2
{
    public static void main(String[] args)
    {
        Scanner eo = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int num = eo.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The given number " + num + " is Even ");
        }
        else
        {
            System.out.print(num+" is an odd integer");
        }
    }
}
