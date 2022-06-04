//2.	Write a program to print all natural numbers in reverse (from n to 1).

package J1_IntroductionToJava.CJ7_LoopsInJava;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i=n ; i>=1; i--)
        {
            System.out.println(i);
        }
    }
}
