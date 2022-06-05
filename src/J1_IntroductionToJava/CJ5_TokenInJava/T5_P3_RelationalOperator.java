package J1_IntroductionToJava.CJ5_TokenInJava;
import java.util.Scanner;

public class T5_P3_RelationalOperator {
    public static void main(String[] args)
    {
        int a, b;
        System.out.print("Enter value of a : ");
        Scanner ab = new Scanner(System.in);
        a = ab.nextInt();
        System.out.print("Enter value of b : ");
        b = ab.nextInt();
        System.out.println("True/False");
        System.out.println(" (a<b) : " + (a<b));
        System.out.println(" (a>b) : " + (a>b));
        System.out.println(" (a<=b) : " + (a<=b));
        System.out.println(" (a>=b) : " + (a>=b));
        System.out.println(" (a==b) : " + (a==b));
        System.out.println(" (a!=b) : " + (a!=b));
    }
}
