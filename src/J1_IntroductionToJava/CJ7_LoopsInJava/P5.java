// 5.	Write a program to print all odd number between 1 and 100.

package J1_IntroductionToJava.CJ7_LoopsInJava;

public class P5
{
    public static void main(String[] args)
    {
        System.out.println("The Odd Numbers are :");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
