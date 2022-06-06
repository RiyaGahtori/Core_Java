/*
11. Write a Java program that accepts two floatingPoint numbers and checks whether they are the same up to two decimal places. Go to the editor

Test Data :
Input first floatingPoint number: 1235
Input second floatingPoint number: 2534

Expected Output :
These numbers are different.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first floatingPoint number: ");
        double num1 = input.nextDouble();
        System.out.print("Input second floatingPoint number: ");
        double num2 = input.nextDouble();
        input.close();

        //The java.lang.Math.abs() method returns the absolute (Positive) value of the argument. The argument can be int, double, long and float.
        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}