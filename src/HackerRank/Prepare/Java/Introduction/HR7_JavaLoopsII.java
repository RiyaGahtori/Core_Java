                                                                    //Use loops to find sum of a series
/*We use the integers a, b, and n to create the following series:
(a+2^0.b),(a+2^0.b+2^1.b),..., (a+2^0.b+2^1.b+...+ 2^(n-1).b)

Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation
-> We use a=0, b=2, and n=10 to produce some series s0, s1,...,s(n-1):
s0 = 0+1.2=2
s1 = 0+1.2+2.2=6
s2 = 0+1.2+2.2+4.2=14
... and so on.
Once we hit n = 10, we print the first ten terms as a single line of space-separated integers.
*/

package HackerRank.Prepare.Java.Introduction;
import java.util.Scanner;

public class HR7_JavaLoopsII {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0;j<n;j++)
            {
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

