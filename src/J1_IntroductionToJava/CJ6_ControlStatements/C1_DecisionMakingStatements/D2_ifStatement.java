                                                              /*            Simple if statement           */

/*
 => if: if statement is the simplest decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not
 i.e. if a certain condition is true then a block of statement is executed otherwise not. It evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true.

=> Syntax:
if(condition) {
statement 1; //executes when condition is true
}

=>Here, the condition after evaluation will be either true or false. if statement accepts boolean values – if the value is true then it will execute the block of statements under it.

=> If we do not provide the curly braces ‘{‘ and ‘}’ after if( condition ) then by default if statement will consider the immediate one statement to be inside its block.
For example,
                 if(condition)
                    statement1;
                    statement2;
// Here if the condition is true, if block will consider only statement1 to be inside its block.
 */

                                                              package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements;


                                                              public class D2_ifStatement
                                                              {
                                                                  public static void main(String[] args)
                                                                  {
                                                                      int x = 10;
                                                                      int y = 12;
                                                                      if(x+y > 20)//True
                                                                      {
                                                                          System.out.println("x + y is greater than 20");
                                                                      }
                                                                      System.out.println("Hello");

                                                                      int a = 21;
                                                                      int b = 99;
                                                                      if(a>b)//False
                                                                      {
                                                                          System.out.println("a is greater than b");
                                                                      }
                                                                      System.out.println("I'm Riri");
                                                                  }
                                                              }

