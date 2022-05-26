                                      /*         Type Casting In Java         */
/*
Type casting is a method or process that converts a data type into another data type in both ways manually and automatically.
=> The automatic conversion is done by the compiler and manual conversion performed by the programmer.

=> Types of Type Casting
There are two types of type casting:
1. Widening Type Casting  (Implicit conversion)
2. Narrowing Type Casting (Explicit conversion)

                                                       Narrowing Type Casting
                                ------------------------------------------------------------->
                                double  -->  float  -->  long  -->  int  -->  short  -->  byte
                                <-------------------------------------------------------------
                                                        Widening Type Casting

=> Widening Type Casting : Converting a lower data type into a higher one is called widening type casting. It is also known as implicit conversion or casting down.
It is done automatically. It is safe because there is no chance to lose data. It takes place when:
-> Both data types must be compatible with each other.
For example, the conversion between numeric data type to char or Boolean is not done automatically. Also, the char and Boolean data types are not compatible with each other.
-> The target type must be larger than the source type.
                                     byte -> short -> char -> int -> long -> float -> double

=> Narrowing Type Casting
Converting a higher data type into a lower one is called narrowing type casting. It is also known as explicit conversion or casting up.
It is done manually by the programmer. If we do not perform casting then the compiler reports a compile-time error.
                                     double -> float -> long -> int -> char -> short -> byte
*/

                                      package J1_IntroductionToJava.CJ3_DataTypes;

                                      public class D4_TypeCastingInJava
                                      {
                                          public static void main(String[] args)
                                          {
                                              // Widening Type Casting
                                              System.out.println("--> Widening Type Casting ");
                                              int x = 21;
                                              long y = x; //automatically converts the integer type into long type
                                              float z = y;//automatically converts the long type into float type
                                              System.out.println("Before conversion, int value : "+x);
                                              System.out.println("After conversion, long value : "+y);
                                              System.out.println("After conversion, float value: "+z);
                                              //In the above example, we have taken a variable x and converted it into a long type. After that, the long type is converted into the float type.

                                              System.out.println(" ");
                                              System.out.println("------------------------------------");
                                              System.out.println(" ");

                                              //Narrowing Type Casting
                                              System.out.println("--> Narrowing Type Casting ");
                                              double d = 199.99;
                                              long l = (long)d;//converting double data type into long data type
                                              int i = (int)l; //converting long data type into int data type
                                              System.out.println("Before conversion, double value: "+d);
                                              System.out.println("After conversion into long type: "+l);//fractional part lost
                                              System.out.println("After conversion into int type : "+i); //fractional part lost
                                              //In the above example, we have converted the double type into long data type after that long data type is converted into int type.
                                          }
                                      }

