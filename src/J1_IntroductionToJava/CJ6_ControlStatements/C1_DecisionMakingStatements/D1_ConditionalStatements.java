                                                                                /*    Decision-Making In Java   */

/*
=> Decision-Making statements: As the name suggests, decision-making statements decide which statement to execute and when. Decision-Making in programming is similar to decision-making in real life.
In programming also face some situations where we want a certain block of code to be executed when some condition is fulfilled.

=> All the programs in Java have set of statements, which are executed sequentially in the order in which they appear. It happens when jumping of statements or repetition of certain calculations is not necessary.
However, there may arise some situations where programmers have to change the order of execution of statements based on certain conditions which involve kind of decision-making statements.

=> There are two types of decision-making statements in Java, i.e., If statement and switch statement.
1. If statement
-> if
-> if-else
-> if-else-if
-> nested-if

2. Switch Statement
*/

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements;

public class D1_ConditionalStatements {
    public static void main (String[] args)
    {
        System.out.println("=> If statement");
        System.out.println("""
                Simple if statement
                if-else statement
                if-else-if ladder
                Nested if-statement""".indent(8));
        System.out.println(" ");
        System.out.println("=> Switch Statement");
    }
}
