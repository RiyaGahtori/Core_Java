// 6.	Write a program to find sum of all natural numbers between 1 to n.

package J1_IntroductionToJava.CJ6_ControlStatements.C2_LoopStatements.PracticeQuestions;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args)
    {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();

        for(i= 1 ; i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("\n The Sum of Natural Numbers from 1 to "+ n + " = " + sum);
    }
}
