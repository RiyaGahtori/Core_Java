// 10.	Write a program to count number of digits in a number.

package J1_IntroductionToJava.CJ7_LoopsInJava;
import java.util.Scanner;

public class P10
{
    public static void main(String[] args)
    {
        long num, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextLong();

        for ( ; num != 0; num /= 10) {
            count++;
        }
        System.out.println("Number of digits : " + count);
    }
}



