                                                    // Java Stdin and Stdout II
/*
Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */

package HackerRank.Prepare.Java.Introduction;
import java.util.Scanner;

public class HR4_JavaStdinAndStdoutII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        scan.nextLine();
        System.out.println("Int: " + i);
    }
}
