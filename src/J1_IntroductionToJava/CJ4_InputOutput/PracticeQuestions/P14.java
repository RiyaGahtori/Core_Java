//14.	Write a program to enter base and height of a triangle and find its area.
/*
Formula:
Area of triangle = 1/2(base*height)
 */

package J1_IntroductionToJava.CJ4_InputOutput.PracticeQuestions;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args){
        float b,h,area;
        Scanner bh = new Scanner(System.in);
        System.out.print("Enter base of triangle : ");
        b = bh.nextFloat();
        System.out.print("Enter base of triangle : ");
        h = bh.nextFloat();
        System.out.println("____________________________________");
        area = (b*h)/2;
        System.out.println("Area of Triangle is : "+area);
        System.out.println("____________________________________");
    }
}
