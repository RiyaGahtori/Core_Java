/*
Variable : A variable is a container which stores the value while the Java program is executed.In other words, it is a name of the memory location.
It is a combination of "vary + able" which means its value can be changed while execution of program.(It is user-defined)

--> A variable is assigned with a data type.
  It can be assigned values in two ways:
=>Variable Initialization
=>Assigning value by taking input

--> How to initialize variables?
It can be perceived with the help of 3 components that are as follows:
->datatype: Type of data that can be stored in this variable.
->variable_name: Name given to the variable.
->value: It is the initial value stored in the variable.

Syntax  : data _type variable_name = value;
Example : int data = 21; // 21 is the value stored by variable_name "data" in "int" data type.

-->Illustrations:
float simpleInterest;  // Declaring float variable
int time = 10, speed = 20; // Declaring and Initializing integer variable
char var = 'h'; // Declaring and Initializing character variable
int a, b, c;         // Declares three ints, a, b, and c.
byte B = 22;         // initializes a byte type variable B.
double pi = 3.14159; // declares and assigns a value of PI.
 */

/*__________________________________________________________________________________________________________________________________________________________________________________*/

                                                          /* Rules to Declare a Variable */
/*
1. A variable name can consist of Capital letters A-Z, lowercase letters a-z, digits 0-9, and two special characters such as _ underscore and $ dollar sign.
2. The first character must not be a digit.
3. Blank spaces cannot be used in variable names.
4. Java keywords cannot be used as variable names.
5. Variable names are case-sensitive.
6. The maximum length of the variable is 64 characters.
7. Variable names always should exist on the left-hand side of assignment operators.
 */


package J1_IntroductionToJava.CJ2_VariablesInJava;

public class V1_Variables {
    public static void main(String[] args) {
        // Declaring all the possible combinations of variable format
        int _a = 10;
        int $b = 20;
        int C = 30;
        int c = 40;
        int result = _a + $b + C + c;

        // Displaying O/P
        System.out.println("Result: " + result);
    }
}


/*
=> Declaration and Initialization
Declaration    : Declaration tells the compiler about the existence of an entity in the program and its location. When you declare a variable, you should also initialize it.
Initialization : Initialization is the process of assigning a value to the Variable. Every programming language has its own method of initializing the variable.
 */







