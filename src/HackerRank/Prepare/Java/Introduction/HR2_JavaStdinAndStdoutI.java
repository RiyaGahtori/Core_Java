                                                            //Get started with standard input and output.
/*
Task
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.

Sample Input
42
100
125

Sample Output
42
100
125
*/
package HackerRank.Prepare.Java.Introduction;
import java.util.*;

public class HR2_JavaStdinAndStdoutI {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}



