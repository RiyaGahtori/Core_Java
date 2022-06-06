                                                                                    /*       if-else statement      */
/*
=>The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block. The else block is executed if the condition of the if-block is evaluated as false.

=> The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t.
But what if we want to do something else if the condition is false. Here comes the else statement. We can use the else statement with if statement to execute a block of code when the condition is false.

=> Syntax:
            if(condition) {
            statement 1; //executes when if condition is true
            }
            else{
            statement 2; //executes when if condition is false
            }
 */
                                                                                    package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements;

                                                                                    public class D3_ifElseStatement {
                                                                                        public static void main(String[] args)
                                                                                        {
                                                                                            int i = 10;

                                                                                            if (i > 15)
                                                                                                System.out.println("i is greater than 15");
                                                                                            else
                                                                                                System.out.println("i is smaller than 15");
                                                                                        }
                                                                                    }



