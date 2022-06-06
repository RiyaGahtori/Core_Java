/*
19. Write a program to calculate and print the Electricity bill of a given customer.
The customer id., name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. The charge are as follows :
Unit	                                         Charge/unit
upto 199	                                     @1.20
200 and above but less than 400	                 @1.50
400 and above but less than 600               	 @1.80
600 and above                                	 @2.00
If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Test Data :
21000
Dwi
800
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Expected Output :
Customer ID.  : 21000
Customer Name : Dwi
unit Consumed : 800
Amount Charges @Rs. 2.00 per unit : 1600.00
Surcharge Amount : 240.00
Net Amount Paid By the Customer : 1840.00
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID : ");
        int id = sc.nextInt();
        System.out.print("Enter the name of the customer : ");
        String name = sc.next();
        System.out.print("Enter the unit consumed by the customer : ");
        int unit = sc.nextInt();

        float charge, surcharge=0, bill, netAmount;
        if (unit <200 )
            charge = 1.20F;
        else	if (unit<400)
            charge = 1.50F;
        else if (unit<600)
            charge = (float) 1.80;
        else
            charge = 2.00F;

        System.out.println("_________________________________________");

        bill = unit*charge;
        if (bill>400)
            surcharge = (float) (bill*15/100.0);
        netAmount = bill+surcharge;
        if (netAmount  < 100)
            netAmount =100;

        System.out.println("           Electricity Bill           ");
        System.out.println("Customer ID.  : "+id);
        System.out.println("Customer Name : "+name);
        System.out.println("unit Consumed : "+unit);
        System.out.println("Amount Charges @Rs. "+charge+" per unit : "+bill);
        System.out.println("Surcharge Amount : "+surcharge);
        System.out.println("Net Amount Paid By the Customer : "+netAmount);

        System.out.println(" ");
        System.out.println ("Thank You!");
        System.out.println ("Have a nice Day");
    }
}
