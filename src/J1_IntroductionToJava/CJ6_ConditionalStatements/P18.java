/*
18. Write a program to calculate profit and loss on a transaction.
Test Data :
500 700
Expected Output :
You can book your profit amount : 200

-----------------------------------------------------------------------------------------------------------
=> Cost price – The amount incurred to us while manufacturing or buying that commodity.
=> Selling price – The amount of money received after selling a given commodity.
=> Profit – The amount one gains in transaction when the selling price is greater than the cost price.
=> Loss – The amount one loses in a transaction when the cost price was greater than the selling price.

=>Profit and loss Formulas –

Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/

package J1_IntroductionToJava.CJ6_ConditionalStatements;
import java.util.Scanner;

public class P18 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Cost Price : ");
        double cp=sc.nextDouble();
        System.out.print("Enter the Selling Price :");
        double sp=sc.nextDouble();

        System.out.println("____________________________________");
        if(cp-sp>0)
        {
            System.out.println("loss : " +(cp-sp));
        }
        else if(cp-sp<0)
        {
            System.out.println("profit : " +(sp-cp));
        }
        else
        {
            System.out.println("NEUTRAL");
        }
        System.out.println("____________________________________");
    }
}
