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
        int l, m, n;
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the first array : ");
         l = sc.nextInt();
        int arr1[]=new int [l];
        System.out.println("Input "+l+" elements in the array : ");
        for (i=0;i<l;i++)
        {
            System.out.print("element - "+i+" : " );
            arr1[i]=sc.nextInt();
        }

        System.out.println(" ");
        System.out.print("Input the number of elements to be stored in the second array : ");
         m = sc.nextInt();
        int arr2[]=new int [l];
        System.out.println("Input "+m+" elements in the array : ");
        for (i=0;i<m;i++)
        {
            System.out.print("element - "+i+" : " );
            arr2[i]=sc.nextInt();
        }

        //size of merged array is size of first array and  size of second array
        n=m+l;

        /*----------------- insert in the third array------------------------------------*/
        int arr3[]=new int [n];
        for( i=0;i<l; i++)
        {
            arr3[i] = arr1[i];
        }
        for(j=0;j<m; j++)
        {
            arr3[i] = arr2[j];
            i++;
        }

        /*----------------- sort the array in decending order ---------------------------*/
        for(i=0;i<n; i++)
        {
            for(k=0;k<n-1;k++)
            {

                if(arr3[k]<=arr3[k+1])
                {
                    j=arr3[k+1];
                    arr3[k+1]=arr3[k];
                    arr3[k]=j;
                }
            }
        }

        /*--------------- Prints the merged array ------------------------------------*/
        System.out.println("The merged array in descending order is : ");
        for(i=0; i<n; i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}

