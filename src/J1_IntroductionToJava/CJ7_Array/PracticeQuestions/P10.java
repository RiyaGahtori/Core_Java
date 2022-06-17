/*
10. Write a program to separate odd and even integers in separate arrays.
Test Data :
Input the number of elements to be stored in the array :5
Input 5 elements in the array :
element - 0 : 25
element - 1 : 47
element - 2 : 42
element - 3 : 56
element - 4 : 32
Expected Output :
The Even elements are :
42 56 32
The Odd elements are :
25 47
 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Input "+l+" elements in the array : ");

        for(int i = 0; i<l; i++)
        {
            System.out.print("element - "+i+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The Even elements are : ");
        for(int i = 0; i<l; i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("The Odd elements are : ");
        for(int i = 0; i<l; i++)
        {
            if(arr[i]%2==1)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
