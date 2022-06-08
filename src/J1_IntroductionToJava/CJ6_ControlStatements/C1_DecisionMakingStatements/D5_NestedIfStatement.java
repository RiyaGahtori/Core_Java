                                                                             /*       Nested if Statements In Java       */
/*
=> nested-if: Nested if statements mean an if statement inside an if statement. i.e, we can place an if statement inside another if statement.

=> If the condition of the outer if statement evaluates to true then the inner if statement is evaluated. Nested if’s are important if we have to declare extended conditions to a previous condition.

=>Syntax:
                if (condition1)
                {
                   // Executes when condition1 is true

                   if (condition2)
                   {
                      // Executes when condition2 is true
                   }
                }
*/
                                                                             package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements;

                                                                             public class D5_NestedIfStatement {
                                                                                 public static void main(String[] args)
                                                                                 {
                                                                                     int i = 10;

                                                                                     if (i == 10) {
                                                                                         // First if statement
                                                                                         if (i < 15)
                                                                                             System.out.println("i is smaller than 15");

                                                                                         // Nested - if statement Will only be executed if statement above it is true
                                                                                         if (i < 12)
                                                                                             System.out.println("i is smaller than 12 too");
                                                                                         else
                                                                                             System.out.println("i is greater than 15");
                                                                                     }
                                                                                 }
                                                                             }


