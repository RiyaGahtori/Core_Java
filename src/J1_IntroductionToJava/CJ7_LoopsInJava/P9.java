// 9.	Write a program to print multiplication table of any number.

package J1_IntroductionToJava.CJ7_LoopsInJava;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=s.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
