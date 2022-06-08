/*
6. Write a program to print all unique elements in an array.
Test Data :
Print all unique elements of an array:
------------------------------------------
Input the number of elements to be stored in the array: 4
Input 4 elements in the array :
element - 0 : 3
element - 1 : 2
element - 2 : 2
element - 3 : 5
Expected Output :
The unique elements found in the array are:
3 5

 */
package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args)
    {
        int i, j, l;
        System.out.println("Print all unique elements of an array : ");
        System.out.println("------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        l = sc.nextInt();
        int arr[]   = new int[l];
//        int count[] =new int[l];

        System.out.println("Input "+l+" elements in the array : ");
        for (i = 0; i < l ; i++)
        {
            System.out.print("element - "+i+" : ");
            arr[i] = sc.nextInt();
        }
        int c=0;
        for(i = 0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                if(arr[j]==arr[i]){
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println("The unique elements found in the array are : "+arr[i]);
            }
            c=0;
        }

    }
}

