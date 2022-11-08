//Syntax : The set of rules to be followed while writing a Java program is called Syntax.
/*
--> The curly braces {} marks the beginning and the end of a block of code.
--> Each code statement must end with a semicolon (;).
--> System.out.println :
    System is a built-in Java class that contains useful members, such as out, which is short for "output".
    The println() method, short for "print line", is used to print a value to the screen (or a file).
--> public static void main : public is used as an access modifier for a main method . static is used so that it can directly load in memory without creating any instance.
    void is used because it does not return any value and main is the entry point of program.
*/

package J1_IntroductionToJava.CJ1_BasicsofJava;

public class B3_Syntax {  // Save as "B3_Syntax.java"

    public static void main(String[] args) { // Program entry point
        System.out.println("Hello, world!");   // Print text message

    }
}


                                                     /*      Why public static void main     */
/*
1. Public : It is an Access modifier, which specifies from where and who can access the method. Making the main() method public makes it globally available.
It is made public so that JVM can invoke it from outside the class as it is not present in the current class.

2. Static : When java runtime starts, there is no object of the class present. That’s why the main method has to be static so that JVM can load the class into memory and call the main method.
If the main method won’t be static, JVM would not be able to call it because there is no object of the class is present.

3. Void : It is a keyword and is used to specify that a method doesn’t return anything. As the main() method doesn’t return anything, its return type is void.
As soon as the main() method terminates, the java program terminates too. Hence, it doesn’t make any sense to return from the main() method as JVM can’t do anything with the return value of it.

4. main : In Java programs, the point from where the program starts its execution or simply the entry point of Java programs is the main() method.

5. String[] args : It stores Java command-line arguments and is an array of type java.lang.String class.
Here, the name of the String array is args, but it is not fixed and the user can use any name in place of it.
 */



