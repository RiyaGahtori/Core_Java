/*
2. Write a program to read n number of values in an array and display it in reverse order.
Test Data :
Input the number of elements to store in the array :3
Input 3 number of elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 7
Expected Output :
The values store into the array are :
2 5 7
The values store into the array in reverse are :
7 5 2

 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        int i, l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to store in the array : ");
        l = sc.nextInt();
        int arr[] = new int[l];

        System.out.println("Input " + l + " number of elements in the array :");
        for (i = 0; i < l; i++)
        {
            System.out.print("Element - " +i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The values store into the array are : ");
        for (i = 0; i < l; i++) {
            System.out.print(arr[i] + " "); //display every array element
        }
        System.out.println(" ");

        System.out.println("The values store into the array in reverse are : ");
        for (i = l-1; i >= 0; i--) {
            System.out.print(arr[i] + " "); //display every array element
        }
    }
}