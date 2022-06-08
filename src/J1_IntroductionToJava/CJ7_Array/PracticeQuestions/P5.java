/*
5. Write a program to count a total number of duplicate elements in an array.
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 5
element - 1 : 1
element - 2 : 1
Expected Output :
Total number of duplicate elements found in the array is : 1

 */
package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args)
    {
        int i, j, l, count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        l = sc.nextInt();
        int arr[] = new int [l];

        System.out.println("Input "+l+" elements in the array : ");
        for (i=0;i<l;i++)
        {
            System.out.print(" element - "+i+" : ");
            arr[i] = sc.nextInt();
        }
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate elements found in the array is : "+count);

    }
}
