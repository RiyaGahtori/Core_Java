                                                       /*        Input (Scanner Class)        */
/*
=> Scanner is a pre-defined class in Java which is available in java.util package. It is used to get user input.
=> System.in : This is the standard input stream that is used to read characters from the keyboard or any other standard input device.

Scanner class methods -
* nextLine();    --> used to input string.
* nextInt();     --> used to input integer value.
* nextFloat();   --> used to input floating value.
* nextBoolean(); --> used to input boolean value.
* nextDouble();  --> used to input double value.
=> we can access these Scanner class methods just by creating a Scanner class object.

=> Java Input from user using the object of Scanner class.
In order to use the object of Scanner, we need to import "java.util.Scanner" package.
--> import java.util.Scanner;

Then, we need to create an object of the Scanner class. We can use the object to take input from the user.
--> Create an abject of Scanner.
    Scanner input = new Scanner(System.in);
--> Take input from the user
    int number = input.nextInt();
Note: Wrong input => Error : Input Mismatch Exception
*/


package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner; // importing lang package

public class I2_Input_ScannerClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // object of a Scanner class is created
        System.out.print("Enter an integer: "); // printing the statement
        int number = input.nextInt(); // scanning/taking input from the user
        System.out.println("You entered " + number); //printing the statement + value of number

        /* In the above example, we have created an object named "input" of the Scanner class. We then call the nextInt() method of the Scanner class to get an integer input from the user
        similarly, we can use "nextLong()", "nextFloat()", "nextDouble" and "nextLine()" or "next()" methods to get "long", "float", "double" and "string" input respectively from the user.*/

        System.out.println("_______________________");

        String a;
        System.out.print("Enter Your Name : ");
        Scanner obj = new Scanner(System.in);
        a = obj.next();
        System.out.println("Name : "+a);

        input.close(); //closing the Scanner object
    }
}
