//8. Write a program to find the square of the number 3.9.

package J1_IntroductionToJava.CJ3_DataTypes.PracticeQuestions;

public class P8
{
    public static void main(String[] args)
    {
        float a, b, power;
        a = (float) 3.9;
        b = 2;
        power = (float)Math.pow(a,b);

        System.out.println(power);//using Math.pow
        System.out.println(" ");

        System.out.println("_____________________");

        System.out.println(" ");
        System.out.println(3.9*3.9);
    }
}