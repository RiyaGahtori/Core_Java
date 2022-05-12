//3.	Write a program to enter two numbers and perform all arithmetic operations.
package IntroductionToJava.InputOutput;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        // Create scanner class object
        Scanner ab = new Scanner(System.in);

        // Input two numbers from user
        System.out.print("Enter the first number: ");
        int a = ab.nextInt();
        System.out.print("Enter the second number: ");
        int b = ab.nextInt();

        // Perform arithmetic operations.
        int sum = a + b;
        int difference = a - b;
        int product = a*b;
        int quotient = a/b;
        int modulo = a%b;

        // Print result to console.
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("The sum of two numbers a and b is : "             + sum);
        System.out.println("The Difference between two numbers a and b is : " + difference);
        System.out.println("The product of two numbers a and b is : "         + product);
        System.out.println("The quotient of two numbers a and b is : "        + quotient);
        System.out.println("The modulo of two numbers a and b is : "          + modulo);
        System.out.println("-----------------------------------------------------------------");

    }
}
