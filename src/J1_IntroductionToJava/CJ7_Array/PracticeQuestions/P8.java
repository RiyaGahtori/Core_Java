/*
8. Write a program to count the frequency of each element of an array.
Test Data :
Input the number of elements to be stored in the array : 3
Input 3 elements in the array :
element - 0 : 25
element - 1 : 12
element - 2 : 43
Expected Output :
The frequency of all elements of an array :
25 occurs 1 times
12 occurs 1 times
43 occurs 1 times
 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args)
    {
        int l, i, j, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        l = sc.nextInt();
        int arr[] = new int[l];

        System.out.println("Input "+l+" elements in the array : ");
        for(i = 0; i<l; i++)
        {
            System.out.print("element - "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The frequency of all elements of an array : ");
        for(i = 0; i<l; i++)
        {
            for(j = 0; j<l; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]+" occurs "+count+" times");
                    count++;
                }
            }
        }
    }
}
