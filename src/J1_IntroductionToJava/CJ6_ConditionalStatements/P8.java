/*
8. Write a program to find the largest of three numbers.
Test Data : 1 21 42
Expected Output :
1st Number = 1,        2nd Number = 21,        3rd Number = 42
The 3rd Number is the greatest among three
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P8
{
    public static void main(String[] args)
    {
        int a, b, c;

        //object of the Scanner class
        Scanner sc = new Scanner(System.in);

        //reading input from the user
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        System.out.print("Enter the third number : ");
        c = sc.nextInt();

        //comparing numbers, a with b and a with c, if both conditions are true, prints a
        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
        //comparing b with a and b with c, if both conditions are true, prints b
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else
        //prints c, if the above conditions are false
            System.out.println(c+" is the largest number");
    }
}
