//11.	Write a program to find power of any number x ^ y.
/*
Formula:
result = base value ^ exponent value
 */

package J1_IntroductionToJava.InputOutput;
import java.util.Scanner;

public class P11 {
    public static void main(String[] args){
        int r, b, y;
        Scanner by = new Scanner(System.in);
        System.out.print("Enter the Base value : ");
        b = by.nextInt();
        System.out.print("Enter the Exponent value : ");
        y = by.nextInt();
        System.out.println("__________________________________");
        r = (int)Math.pow(b,y); //By using the Math.pow() function
        System.out.println("The power of number "+ b+ "^" +y +" is : " + r);
        System.out.println("__________________________________");
    }
}
