                                                                      /*        Literals In Java        */


/*
=> Literals: Any constant value which can be assigned to the variable is called literal/constant.
=> In programming literal is a notation that represents a fixed value (constant) in the source code. It can be categorized as an integer literal, string literal, Boolean literal, etc.
   It is defined by the programmer. Once it has been defined cannot be changed.
   => Java provides five types of literals are as follows:
     1.   Integer
     2.   Floating Point
     3.   Character
     4.   String
     5.   Boolean
_________________________________________________________________________________________________________________________________________________________________________________________________________________
 Example :
          => Literal                     => Type
             23	                            int
             9.86	                        double
             false, true	                boolean
             'K', '7', '-'                  char
             "Riri"	                        String
 */

                                                                      package J1_IntroductionToJava.CJ5_TokenInJava;

                                                                      public class T4_Literals {
                                                                          public static void main(String[] args)
                                                                          {
                                                                              int d = 100;        // Here 100 is an Integer constant/literal.
                                                                              double w = 123.456; // Here 123.456 is a Floating Point constant/literal.
                                                                              char i = 'a';       // Here 'a' is a Character constant/literal.
                                                                              String r = "Hello"; // Here "Hello" is a String constant/literal.
                                                                              boolean a = true;   // Here true is a Boolean constant/literal.

                                                                              System.out.println(d);
                                                                              System.out.println(w);
                                                                              System.out.println(i);
                                                                              System.out.println(r);
                                                                              System.out.println(a);
                                                                          }
                                                                      }


