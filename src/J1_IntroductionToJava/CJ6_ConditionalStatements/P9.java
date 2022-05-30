/*
9. Write a program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies.
Test Data : 2 1
Expected Output : The coordinate point (2,1) lies in the First quadrant.
 */

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args){
        Scanner xy = new Scanner(System.in);
        System.out.print("Enter the First coordinate point : ");
        int x = xy.nextInt();
        System.out.print("Enter the Second coordinate point : ");
        int y = xy.nextInt();
    }
}
