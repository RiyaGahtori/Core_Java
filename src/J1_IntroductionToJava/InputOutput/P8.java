//8.	Write a program to enter temperature in Celsius and convert it into Fahrenheit.
/*
Fahrenheit and Celsius are the measures of temperature having Unit in degrees as oF, oC respectively.
Formula :
T(oF)   =  (T(oC)   ×  (9/5)) + 32
 */

package J1_IntroductionToJava.InputOutput;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args){
        float C, F;
        Scanner temperature = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        C = temperature.nextFloat();
        System.out.println("____________________________________");
        F = ((C*9)/5)+32;
        System.out.println("Temperature in Fahrenheit = " + F);
        System.out.println("____________________________________");
    }
}