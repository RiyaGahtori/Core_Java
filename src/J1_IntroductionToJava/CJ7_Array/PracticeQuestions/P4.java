/*
4. Write a program to copy the elements of one array into another array.
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 15
element - 1 : 10
element - 2 : 12
Expected Output :
The elements stored in the first array are :
15 10 12
The elements copied into the second array are :
15 10 12
 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P4
{
    public static void main(String[] args)
    {
        int i, l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        l = sc.nextInt();
        int arr1[]=new int[l];
        int arr2[]= new int[l]; //Create another array arr2 with size of arr1

        System.out.println("Input "+l+" elements in the array :");
        for(i=0;i<l;i++)
        {
            System.out.print(" element - "+i+" : ");
            arr1[i] = sc.nextInt();
        }

        //Copying all elements of one array into another
        for (i = 0; i < l; i++) {
            arr2[i] = arr1[i];
        }

        //Displaying elements of array arr1
        System.out.println("The elements stored in the first array are : ");
        for(i=0;i<l;i++)
        {
            System.out.print(arr1[i]+" ");
        }

        System.out.println(" ");

        //Displaying elements of array arr2
        System.out.println("The elements copied into the second array are : ");
        for(i=0;i<l;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}

