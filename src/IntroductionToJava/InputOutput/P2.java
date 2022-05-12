//2.	Write a program to enter two numbers and find their sum.
package IntroductionToJava.InputOutput;
import java.util.Scanner;
import static java.lang.Integer.sum;

public class P2 {
    public static void main(String[] args) {
        int num1 = 18, num2 = 3, addition;
        addition = num1 + num2;
        System.out.println("The sum of numbers is : " + addition);
        System.out.println("-------------------------------------");

        //By Using User-defined Method
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = sc.nextInt();
        System.out.println("Enter the second number: ");
        y = sc.nextInt();
        sum = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum);
    }
}

