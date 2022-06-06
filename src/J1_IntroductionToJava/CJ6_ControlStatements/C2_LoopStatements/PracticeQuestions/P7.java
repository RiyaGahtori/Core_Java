//7.	Write a program to find sum of all even numbers between 1 to n.

package J1_IntroductionToJava.CJ6_ControlStatements.C2_LoopStatements.PracticeQuestions;
import java.util.Scanner;

public class P7
{
    public static void main(String[] args)
    {
        int n, i,sum=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();

        for (i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                sum += i;
            }
        }
        System.out.println("Sum of all even numbers from 1 to "+n +" is : "+sum);
    }
}
