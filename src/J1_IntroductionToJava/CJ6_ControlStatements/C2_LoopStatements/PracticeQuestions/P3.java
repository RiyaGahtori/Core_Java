// 3.	Write a program to print all alphabets from a to z.

package J1_IntroductionToJava.CJ6_ControlStatements.C2_LoopStatements.PracticeQuestions;

public class P3
{
    public static void main(String[] args)
    {
        char c;
        for(c = 'a'; c <= 'z'; ++c)
            System.out.print(c + "  ");
    }
}
