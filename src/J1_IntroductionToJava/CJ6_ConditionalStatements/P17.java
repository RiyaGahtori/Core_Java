/*
17. Write a program to check whether an alphabet is a vowel or consonant.
Test Data : k
Expected Output : The alphabet is a consonant.
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Alphabet : ");
        char ch = sc.next().charAt(0);

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Alphabet "+ch+" is a Vowel");
        }
        else
        {
            System.out.println("Alphabet "+ch+" is a Consonant");
        }
    }
}