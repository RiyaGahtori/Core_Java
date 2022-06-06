/*
13. Write a program to read temperature in centigrade and display a suitable message according to temperature state below :
Temp < 0     then Freezing weather
Temp 0-10    then Very Cold weather
Temp 10-20   then Cold weather
Temp 20-30   then Temp is Normal
Temp 30-40   then It's Hot
Temp >=40    then It's Very Hot

Test Data : 42
Expected Output : It's very hot.
 */

package J1_IntroductionToJava.CJ6_ControlStatements.C1_DecisionMakingStatements.IfElse_PracticeQuestions;
import java.util.Scanner;

public class P13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Centigrade : ");
        int temp = sc.nextInt();

        if ( temp < 0)
        {
            System.out.println("Freezing weather! ");
        }
        else if (temp>0 && temp<10)
        {
            System.out.println("Very Cold weather!");
        }
        else if (temp>10 && temp<20)
        {
            System.out.println("It's Cold!");
        }
        else if (temp>20 && temp<30)
        {
            System.out.println("Temperature is Normal");
        }
        else if (temp>30 && temp<40)
        {
            System.out.println("It's Hot!");
        }
        else
        {
            System.out.println("It's Very Hot!");
        }
    }
}
