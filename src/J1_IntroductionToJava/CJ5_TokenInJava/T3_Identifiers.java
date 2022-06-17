                                                                /*       Identifiers In Java       */

/*
=> In Java, identifiers are the names that are used for the identification of various entities in java like classes, methods, variables, packages, etc.
So in Java, Identifiers are the Class names, Method names, variable names, package names, constant names, etc. It usually defined by the user.

=> There are some rules to declare identifiers. These rules must be followed, otherwise we get compile-time error.
1. The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).
   For example : “geek@” is not a valid java identifier as it contain ‘@’ special character.

2. Identifiers should not start with digits([0-9]).
   For example : “123geeks” is a not a valid java identifier.

3. Java identifiers are case-sensitive.

4. There is no limit on the length of the identifier, but it is advisable to use an optimum length of 4 – 15 letters only.

5. Reserved Words(Keywords) can’t be used as an identifier.
   For example : “int while = 20;” is an invalid statement as while is a reserved word.

6. The whitespace cannot be included in the identifier.
_________________________________________________________________________________________________________________________________________________________________________________________________________________*/

                                                                package J1_IntroductionToJava.CJ5_TokenInJava;          // => Identifiers in the sample code :

                                                                public class T3_Identifiers {                           // T3_Identifiers (Class name)
                                                                    public static void main(String[] args) {            // main (Method name), String (Predefined Class name), args (String variable name)
                                                                        int var1 = 99;                                  // var1 (integer variable name)
                                                                        double var2 = 2.0;                              // var2 (double variable name)
                                                                        System.out.println("Hello World!");             //System(Predefined Class name), out(Variable name), println (Method name)
                                                                    }
                                                                }

/*_________________________________________________________________________________________________________________________________________________________________________________________________________________
=> Examples of valid identifiers :
MyVariable
MYVARIABLE
myvariable
x
x1
_myvariable
$myvariable
sum_of_array
riri123

=> Examples of invalid identifiers :
My Variable  // contains a space
123riri  // Begins with a digit
a+c // plus sign is not an alphanumeric character
variable-2 // hyphen is not an alphanumeric character
sum_&_difference // ampersand is not an alphanumeric character
 */





