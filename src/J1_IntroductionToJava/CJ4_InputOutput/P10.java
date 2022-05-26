//10.	Write a program to convert days into years, weeks and days.
/*
1 year = 365 days
1 week = 7 days

Days conversion formula : Days to years (ignoring leap year) and weeks conversion formula is expressed as:
years = (days / 365)
weeks = (days % 365) / 7
days  = (days % 365) % 7
 */

package J1_IntroductionToJava.CJ4_InputOutput;
import java.util.Scanner;

public class P10 {
    public static void main(String[] args){
        int d, y, w;
        Scanner days = new Scanner(System.in);
        System.out.print("Enter the Days : ");
        d = days.nextInt();
        y = (d / 365) ;
        w = (d % 365) / 7;
        d = (d % 365) % 7;
        System.out.println("__________________________________");
        System.out.print(y + " year , ");
        System.out.print(w + " weeks and ");
        System.out.println(d + " days");
        System.out.println("__________________________________");
    }
}

/*
Input : 1329
Output: 3 years, 33 weeks and 3 days.
 */