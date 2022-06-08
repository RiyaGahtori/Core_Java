                                                        /*        if-else-if Statements In Java        */
/*
=> if-else-if ladder: These statements are similar to the if else statements. The only difference lies in the fact that each of the else statements can be paired with a different if condition statement.

=> Here, a user can decide among multiple options. The if statements are executed from the top down.
As soon as one of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed.
If none of the conditions is true, then the final else statement will be executed.

=> Syntax:
             if (condition)
                 statement;
             else if (condition)
                 statement;
             else if (condition)
                 statement;
             .
             .
             else
                 statement;
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements;
import java.util.Scanner;

public class D4_ifElseIfLadder
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of i : ");
        i = sc.nextInt();
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("Error!"+"\nWrong value");
    }
}
