/*
16. Write a program to check whether a character is an alphabet, digit or special character.
Test Data : @
Expected Output : This is a special character.
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P16 {
    public static void main(String[] args)
    {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if((ch >='a'&&ch <='z')||(ch >='A'&&ch <='Z'))
        {
            System.out.println(ch + " is a ALPHABET.");
        }
        else if(ch >='0'&&ch <='9')
        {
            System.out.println(ch + " is a DIGIT.");

        }
        else
        {
            System.out.println(ch + " is a SPECIAL CHARACTER.");
        }
}
}

