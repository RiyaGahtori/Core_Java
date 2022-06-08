                                                                      /*       Switch Statement In Java       */
/*
=> switch-case: The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression.

=> It is a different form of the if-else-if ladder statements. This saves the hassle of writing else if for every different option.

=> Syntax:
                  switch (expression)
                  {
                    case value1:
                      statement1;
                      break;
                    case value2:
                      statement2;
                      break;
                    .
                    .
                    case valueN:
                      statementN;
                      break;
                    default:
                      statementDefault;
                  }


-> The expression can be of type byte, short, int char, or an enumeration. Beginning with JDK7, expression can also be of type String.
-> Duplicate case values are not allowed.
-> The default statement is optional.
-> The break statement is used inside the switch to terminate a statement sequence.
-> The break statement is optional. If omitted, execution will continue on into the next case.
 */
                                                                      package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements;
                                                                      import java.util. * ;

                                                                      public class D6_SwitchStatement {
                                                                          public static void main(String[] args)
                                                                          {
                                                                              Scanner sc = new Scanner(System. in );
                                                                              System.out.println("            Welcome            ");
                                                                              System.out.println("You have two options of courses");
                                                                              System.out.println("1.Java");
                                                                              System.out.println("2.C++");
                                                                              System.out.println("_______________________________________");
                                                                              System.out.println(" ");
                                                                              System.out.print("Enter the number of course : ");
                                                                              int ch = sc.nextInt();
                                                                              switch (ch) {
                                                                                  case 1 -> System.out.println("Congrats you have chosen Java!");
                                                                                  case 2 -> System.out.println("Congrats you have chosen C++!");
                                                                                  default -> System.out.println("Oops!" + "\nWrong input!");
                                                                              }
                                                                          }
                                                                      }
/*
                case 1:
                    System.out.println("Congrats you have chosen Java!");
                    break;
                case 2:
                    System.out.println("Congrats you have chosen C++!");
                    break;
                default:
                    System.out.println("Oops!"+"\nWrong input!");
                    break;
 */


