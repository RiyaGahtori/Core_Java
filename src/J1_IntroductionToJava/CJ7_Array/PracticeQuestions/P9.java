/*
9. Write a program to find the maximum and minimum element in an array.
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 45
element - 1 : 25
element - 2 : 21
Expected Output :
Maximum element is : 45
Minimum element is : 21
 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args)
    {
        int i, l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Input "+l+" elements in the array : ");

        int min=Integer.MAX_VALUE; //Integer.MAX_VALUE represents the maximum positive integer value that can be represented in 32 bits
        int max=Integer.MIN_VALUE; //Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java.

        for(i = 0;  i<l; i++)
        {
            System.out.print("element - "+i+" : ");
            arr[i] = sc.nextInt();

            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Minimum element is : "+min);
    }
}
