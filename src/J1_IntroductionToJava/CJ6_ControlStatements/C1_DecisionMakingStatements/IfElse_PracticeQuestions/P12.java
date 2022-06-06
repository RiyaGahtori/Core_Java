/*
12. Write a program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
Test Data :
Input the Roll Number of the student :784
Input the Name of the Student :James
Input the marks of Physics, Chemistry and Computer Application : 70 80 90
Expected Output :
Roll No : 20012529
Name of Student : Riri
Marks in Physics : 70
Marks in Chemistry : 80
Marks in Computer Application : 90
Total Marks = 240
Percentage = 80.00
Division = First
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Roll Number of the Student : ");
        int roll = sc.nextInt();
        System.out.print("Enter The Name of the Student : ");
        String name = sc.next();
        System.out.print("Enter the marks of Physics, Chemistry and Computer Application : ");
        int p = sc.nextInt();
        int c = sc.nextInt();
        int ca = sc.nextInt();

        System.out.println(" ");

        int total = p + c + ca;
        float percentage = (float) (total/3.0);
        String div;
        if (percentage >= 60)
        {
            div = " First";
        }
        else if (percentage < 60 && percentage >= 48)
        {
            div = " Second";
        }
        else if (percentage <48 && percentage >= 36)
        {
            div = " Pass";
        }
        else
        {
            div = " Fail";
        }

        System.out.println("Roll No. : " +roll);
        System.out.println("Name of Student : "+name);
        System.out.println("Marks in Physics : "+p);
        System.out.println("Marks in Chemistry : "+c);
        System.out.println("Marks in Computer Application : "+ca);
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = "+percentage);
        System.out.println("Division = "+div);
    }
}
