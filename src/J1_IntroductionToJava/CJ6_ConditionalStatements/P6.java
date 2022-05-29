/*
6. Write a program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.
Test Data : -21
Expected Output : The value of n = -1
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args)
    {
        int n, m;
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the value of m : ");
        m = abc.nextInt();

        if (m!=0)
        {
            if(m>0)
            {
                System.out.println("The value of n is 1");
            }
            if(m < 0)
            {
                System.out.println("The value of n is -1");
            }
        }

        else
        {
            System.out.println("The value of n is 0");
        }
    }
}
