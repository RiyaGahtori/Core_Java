//16.	Write a program to enter marks of five subjects and calculate total, average and percentage.

package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner;

public class P16 {
    public static void main(String[] args){
        float english, maths, chem, phy, comp;
        double total, average, percentage;
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter marks of five subjects - ");
        System.out.print("Enter marks of English subject : ");
        english = marks.nextFloat();
        System.out.print("Enter marks of Maths subject : ");
        maths = marks.nextFloat();
        System.out.print("Enter marks of Chemistry subject : ");
        chem = marks.nextFloat();
        System.out.print("Enter marks of Physics subject : ");
        phy = marks.nextFloat();
        System.out.print("Enter marks of Computer subject : ");
        comp = marks.nextFloat();
        System.out.println("__________________________________________________");
        total = english + maths + chem + phy + comp;
        average = (total/5.0);
        percentage = (total/500.0)*100;
        System.out.println("Total marks = "+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage);
        System.out.println("__________________________________________________");
    }
}
