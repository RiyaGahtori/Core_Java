/*
7. Write a program to merge two arrays of same size sorted in descending order.
Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Expected Output :
The merged array in descending order is :
3 3 2 2 1 1
 */
package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the first array : ");
        int l = sc.nextInt();
        int arr[]=new int [l];
        System.out.println("Input "+l+" elements in the array : ");
        for (int i=0;i<l;i++)
        {
            System.out.print("element - "+i+" : " );
            arr[i]=sc.nextInt();
        }

        System.out.println(" ");
        System.out.print("Input the number of elements to be stored in the second array : ");
        int m = sc.nextInt();
        System.out.println("Input "+m+" elements in the array : ");
        for (int i=0;i<m;i++)
        {
            System.out.print("element - "+i+" : " );
            arr[i]=sc.nextInt();
        }

    }
}
