//13.	Write a program to enter two angles of a triangle and find the third angle.
/*
--> a° + b° + c° = 180°
Formula:
c° = 180° - (a° + b°)
 */

package J1_IntroductionToJava.CJ4_InputOutput.PracticeQuestions;
import java.util.Scanner;

public class P13 {
    public static void main(String[] args){
        int a, b, c;             //a = 1st angle, b = 2nd angle, c = 3rd angle
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter First angle of triangle abc : ");
        a = ab.nextInt();
        System.out.print("Enter Second angle of triangle abc : ");
        b = ab.nextInt();
        System.out.println("______________________________________");
        c = 180 - (a+b);
        System.out.println("Third angle of the triangle : " +c);
        System.out.println("______________________________________");
    }
}
