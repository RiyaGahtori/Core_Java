// 4.	Write a program to print all even numbers between 1 and 100.

package J1_IntroductionToJava.CJ6_ControlStatements.C2_LoopStatements.PracticeQuestions;

public class P4
{
    public static void main(String[] args)
    {
        System.out.println("List of even numbers from 1 to 100 : ");
        for(int i=1; i<=100; i++)
        {
            if(i%2==0)
            {
                System.out.print(i + ("  "));
            }
        }
    }
}
