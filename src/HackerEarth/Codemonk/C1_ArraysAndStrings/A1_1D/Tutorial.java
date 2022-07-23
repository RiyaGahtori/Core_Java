/*
Given the size and the elements of array A, print all the elements in reverse order.

Input:
First line of input contains, N - size of the array.
Following N lines, each contains one integer, i{th} element of the array i.e. A[i].

Output:
Print all the elements of the array in reverse order, each element in a new line.
--------------------------------------------------------------------------------------
SAMPLE INPUT                                SAMPLE OUTPUT
5                                           9
4                                           15
12                                          7
7                                           12
15                                          4
9
--------------------------------------------------------------------------------------*/

package HackerEarth.Codemonk.C1_ArraysAndStrings.A1_1D;
import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
        int i, l;
        Scanner  sc = new Scanner(System.in);
        l = sc.nextInt();
        int arr[] = new int[l];
        for (i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (i = l-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}


