/*
3. Write a program to find the sum of all elements of the array.
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 8
Expected Output :
Sum of all elements stored in the array is : 15
 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args)
    {
        int i, l, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        l = sc.nextInt();
        int arr[]=new int[l];

        System.out.println("Input "+l+" elements in the array :");
        for(i=0;i<l;i++)
        {
            System.out.print(" element - "+i+" : ");
            arr[i] = sc.nextInt();
        }
        for(i=0;i<l;i++)
        {
            sum = sum + arr[i];
        }
        System.out.print("Sum of all elements stored in the array is : "+sum);

    }
}
