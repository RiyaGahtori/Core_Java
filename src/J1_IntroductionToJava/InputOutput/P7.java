//7.	Write a program to enter length in centimeter and convert it into meter and kilometer.
 /*
 1m = 100cm
 1km = 10000cm
 */

package J1_IntroductionToJava.InputOutput;
import java.util.Scanner;

public class P7 {
    public static void main (String[] args){
        float l, meter, kilometer;
        Scanner length = new Scanner(System.in);
        System.out.print("Enter the length in centimeter : ");
        l = length.nextFloat();
        meter = (l/100);
        kilometer = (l/100000);
        System.out.println("_________________________________________");
        System.out.println("Length in Meter      = " + meter + " meter");
        System.out.println("Length in Kilometer  = " + kilometer + " kilometer");
        System.out.println("_________________________________________");
    }
}
