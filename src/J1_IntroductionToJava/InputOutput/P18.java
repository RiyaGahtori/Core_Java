/*18.	Take 3 inputs from user and check :
-->all are equal
-->any of two are equal
( use && || )
 */

package J1_IntroductionToJava.InputOutput;
import java.util.Scanner;

public class P18 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = s.nextInt();
        System.out.print("Enter second number : ");
        int b = s.nextInt();
        System.out.print("Enter third number : ");
        int c = s.nextInt();
        System.out.println("_______________________________________");
        System.out.println("All are equal : "+(b == c && a == c));
        System.out.println("Any two are equal : "+(a==b||b==c||c==a));
        System.out.println("_______________________________________");
    }

}


