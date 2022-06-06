/*
10. Write a program to find the eligibility of admission for a professional course based on the following criteria:
Eligibility Criteria :
Marks in Maths >=65
and Marks in Phy >=55
and Marks in Chem>=50 and
Total in all three subject >=190 or Total in Maths and Physics >=140
-------------------------------------
Test Data :
Input the marks obtained in Physics :65
Input the marks obtained in Chemistry :51
Input the marks obtained in Mathematics :72
Total marks of Maths, Physics and Chemistry : 188
Total marks of Maths and Physics : 137
Expected Output :
The candidate is not eligible for admission.
*/

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained in Physics : ");
        int phy = sc.nextInt();
        System.out.print("Enter the marks obtained in Chemistry : ");
        int chem = sc.nextInt();
        System.out.print("Enter the marks obtained in Mathematics : ");
        int maths = sc.nextInt();
        int three = phy + chem + maths;
        int mp = maths+phy;
        if (maths>=65 && phy >= 55 && chem >= 50 && three>=190 || mp>=140)
        {
            System.out.println("The candidate is eligible for admission.");
        }
        else
        {
            System.out.println("The candidate is not eligible for admission.");
        }
    }
}
