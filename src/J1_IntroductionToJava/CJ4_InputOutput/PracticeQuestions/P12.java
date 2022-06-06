//12.	Write a program to enter any number and calculate its square root.
/*
Formula :
root = number^(1/2)
 */

package J1_IntroductionToJava.CJ4_InputOutput.PracticeQuestions;
import java.util.Scanner;

public class P12 {
    public static void main(String[] args){
        double num, sq;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = number.nextDouble();

        System.out.println("____________________________________");
        //By using the Math.sqrt() function
        sq = Math.sqrt(num);
        System.out.println("The Square root of "+num+" is "+sq);
        System.out.println("____________________________________");
    }
}
