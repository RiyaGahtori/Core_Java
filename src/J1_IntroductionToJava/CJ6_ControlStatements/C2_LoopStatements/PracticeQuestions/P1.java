// 1.	Write a program to print all natural numbers (from 1 to n).

package J1_IntroductionToJava.CJ6_ControlStatements.C2_LoopStatements.PracticeQuestions;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();

        for (int i=1 ; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
