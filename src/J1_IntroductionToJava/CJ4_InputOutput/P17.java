//17.	Write a program to enter P, T, R and calculate Simple Interest.
/*
Formula :
Simple Interest = (P × R × T)/100
where  P = Principal Amount, R = Rate per Annum, T = Time (years)
 */

package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner;

public class P17 {
    public static void main(String[] args){
        double P, R, T,SI;
        Scanner prt = new Scanner(System.in);
        System.out.print("Enter The Principal Amount: ");
        P = prt.nextDouble();
        System.out.print("Enter Rate per Annum: ");
        R = prt.nextDouble();
        System.out.print("Enter The Time: ");
        T = prt.nextDouble();
        System.out.println("____________________________________");
        SI = (P*R*T)/100;
        System.out.println("Simple Interest = "+SI);
        System.out.println("____________________________________");
    }

}
