/*
Java Input from user using the object of Scanner class.
In order to use the object of Scanner, we need to import "java.util.Scanner" package.
--> import java.util.Scanner;
Then, we need to create an object of the Scanner class. We can use the object to take input from the user.
--> Create an abject of Scanner
    Scanner input = new Scanner(System.in);
--> Take input from the user
    int number = input.nextInt();
 */
package IntroductionToJava.InputOutput;
import java.util.Scanner;

public class Input_ScannerClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        input.close(); //closing the Scanner object
    }
}
/* In the above example, we have created an object named "input" of the Scanner class. We then call the nextInt() method of the Scanner class to get an integer input from the user.
similarly, we can use "nextLong()", "nextFloat()", "nextDouble" and "next()" methods to get "long", "float", "double" and "string" input respectively from the user.
 */