/*
1. Write a program to store elements in an array and print it.
Test Data :
Input 10 elements in the array :
element - 0 : 1
element - 1 : 1
element - 2 : 2
.......
Expected Output :
Elements in array are: 1 1 2 3 4 5 6 7 8 9
 */

package J1_IntroductionToJava.CJ7_Array.PracticeQuestions;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int i, l;
        System.out.print("Enter the length of Array : "); //Ask input from the user for array length
        Scanner sc = new Scanner(System.in);//create a scanner instance for receives input from the user
        l = sc.nextInt();//Reading the input from the user
        int arr[] = new int[l]; //declaration and creation of array

        System.out.println("Input " + l + " elements in the array :"); //Ask input for array elements
        for (i = 0; i < l; i++) {
            System.out.print("element - "+ i+ " : ");
            arr[i] = sc.nextInt(); //Reading the input from the user
        }

        System.out.println("Elements in array are : ");
        for (i = 0; i < l; i++) {
            System.out.print(arr[i] + " "); //display every array element
        }
    }
}
