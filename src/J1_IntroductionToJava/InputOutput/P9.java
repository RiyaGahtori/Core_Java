//9.	Write a program to enter temperature in Fahrenheit and convert to Celsius
/*
Formula :
T(°C)   =  ((T(oF)  -  32  ) ×  5)/9
 */

package J1_IntroductionToJava.InputOutput;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args){
        float F, C;
        Scanner Temperature = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        F = Temperature.nextFloat();
        System.out.println("_______________________________________");
        C  = ((F-32)*5)/9;
        System.out.println("Temperature in Celsius is : " + C + " °C");
        System.out.println("___________________________________________");
    }
}
