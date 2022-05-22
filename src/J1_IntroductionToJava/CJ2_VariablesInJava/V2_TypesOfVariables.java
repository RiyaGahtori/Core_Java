                                                       /* Types of Variables in Java */
/*
Types of Variables :
1. Local Variables -   A variable defined within a block or method or constructor is called a local variable.
=>These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
=>The scope of these variables exists only within the block in which the variable is declared. i.e., we can access these variables only within that block.
=>Initialization of the local variable is mandatory before using it in the defined scope.

2. Instance Variables - Instance variables are non-static variables and are declared in a class outside any method, constructor, or block.
=>As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed .
(The life of an instance variable depends on the life of an Object, i.e., when the object is created, an instance variable also gets created and the same happens when an object is destroyed.)
=>Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
=>Initialization of Instance Variable is not Mandatory. Its default value is 0
*=>Instance Variable can be accessed only by creating objects.

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
                                                           static String name = "Riri";//Static variable
                                                           static int age = 18;//Static variable
                                                           int year=2003;//instance variable
                                                           public static void main(String[] args)
                                                           {
                                                               int date = 10;//Local Variable
                                                               System.out.println("Date : " + date);

                                                               //Instance Variable can be used only by creating objects
                                                               //class-name object = new class-name();
                                                               V2_TypesOfVariables inst = new V2_TypesOfVariables();
                                                               //Syntax : <reference variable-name >.<instance variable-name >
                                                               System.out.println("Year : " +inst.year);

                                                               //A static method can be accessed directly by the class name and does not need any object
                                                               //Syntax: <class-name>.<variable-name>
                                                               System.out.println("Name : "+V2_TypesOfVariables.name);
                                                               System.out.println("Age : "+V2_TypesOfVariables.age);
                                                           }//end of method

                                                       }//end of class

/*__________________________________________________________________________________________________________________________________________________________________________________________

Sr. Local variables	                                           Instance variables	                                     Static variables
No.
1.  Variables declared within a method are local variables.    An instance variable is declared inside a class           Static variables are declared inside a class but outside a method
                                                               but outside any method or block.                          starting with a keyword static.

2.	The scope of the local variable is limited to the method,  An instance variable is accessible throughout the class.  The static variable is accessible throughout the class.
	it is declared inside.

3.	A local variable starts its lifetime when the method is    The object associated with the instance variable decides  The static variable has the same lifetime as the program.
    invoked.		                                           its lifetime.

4.  Local variable is accessible to all the objects of         Instance variable has different copies for different      Static variables only have one single copy of the entire class.
    the class.		                                           objects.

5.	Used to store values that are required for a 	           Used to store values that are needed to be accessed by    Used for storing constants.
    particular method.                                         different methods of the class.

__________________________________________________________________________________________________________________________________________________________________________________________*/

