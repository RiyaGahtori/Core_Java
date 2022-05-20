                                                       /* Types of Variables in Java */
/*
Types of Variables :
1. Local Variables -   A variable defined within a block or method or constructor is called a local variable.
=>These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
=>The scope of these variables exists only within the block in which the variable is declared. i.e., we can access these variables only within that block.
=>Initialization of the local variable is mandatory before using it in the defined scope.

2. Instance Variables - Instance variables are non-static variables and are declared in a class outside any method, constructor, or block.
=>As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
=>Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
=>Initialization of Instance Variable is not Mandatory. Its default value is 0
=>Instance Variable can be accessed only by creating objects.

3. Static Variables - Static variables are also known as Class variables.
=>These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
=>Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
=>Static variables are created at the start of program execution and destroyed automatically when execution ends.
=>Initialization of Static Variable is not Mandatory. Its default value is 0
=>If we access the static variable like the Instance variable (through an object), the compiler will show the warning message, which won’t halt the program.
The compiler will replace the object name with the class name automatically.
=>If we access the static variable without the class name, the compiler will automatically append the class name.
 */

                                               package J1_IntroductionToJava.CJ2_VariablesInJava;

                                                       public class V2_TypesOfVariables
                                                       {
                                                               static String name;//Static variable
                                                               static int age;//Static variable

                                                               static void d()  //This is a Static Method
                                                               {
                                                                   System.out.println("Name : "+name);
                                                                   System.out.println("Age : "+age);
                                                               }//end of Static method

                                                           void method()  //This is a Local Method
                                                           {
                                                               int date = 10; //Local Variable (This variable is local to this main method only)
                                                               System.out.println("Date : " + date);
                                                           }//end of method

                                                               public static void main(String[] args)// This is also a static method
                                                               {
                                                                   int year=2003;//instance variable
                                                                   System.out.println("Year : " +year);

                                                                   name = "Riri";
                                                                   age = 18;
                                                                   d();
                                                               }
                                                       }//end of class



