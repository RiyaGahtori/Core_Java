/*
26. Write a program which is a Menu-Driven Program to perform a simple calculation.
Test Data :
10
2
3
Expected Output :
The Multiplication of 10 and 2 is: 20
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P26 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Integer  : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Integer : ");
        int num2 = sc.nextInt();
        System.out.println("__________________________________");
        System.out.println(" Press 1 for Addition ");
        System.out.println(" Press 2 for Subtraction ");
        System.out.println(" Press 3 for Multiplication ");
        System.out.println(" Press 4 for Division ");
        System.out.println("__________________________________");
        System.out.print("Your Choice : ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            int add = num1+num2;
            System.out.println("The Addition of "+num1+" and "+num2+" is : "+ add);
        }
        else if (choice == 2)
        {
            int sub = num1-num2;
            System.out.println("The Subtraction of "+num1+" and "+num2+" is : "+ sub);
        }
        else if (choice == 3)
        {
            int multi  = num1 * num2;
            System.out.println("The Multiplication of "+num1+" and "+num2+" is : "+ multi);
        }
        else if (choice == 4)
        {
            if (num2 == 0)
            {
                System.out.println("Error!");
                System.out.println("The second integer is zero");
            }
            else
            {
                int div = num1/num2;
                System.out.println("The Division of "+num1+" and "+num2+" is : "+ div);
            }
        }
        else {
            System.out.println("Error!");
            System.out.println("Invalid choice");
        }
    }
}
