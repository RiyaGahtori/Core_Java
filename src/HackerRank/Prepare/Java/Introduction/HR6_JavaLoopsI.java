                                                                      //Let's talk about loops
/*Task
Given an integer, N , print its first 10 multiples. Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

Sample Input
2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */
package HackerRank.Prepare.Java.Introduction;
import java.util.*;

public class HR6_JavaLoopsI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10;i++)
        {
            int a = n * i;
            System.out.printf("%d x %d = %d\n",n,i,a);
        }
    }
}