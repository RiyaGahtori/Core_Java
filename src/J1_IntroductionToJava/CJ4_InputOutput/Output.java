/*
Java Output
In Java , to send output to standard output(screen) we can simply use -
System.out.println(); --> It prints string inside the quotes similar like print() method.Then cursor moves to the beginning of the next line.
System.out.print();   --> It prints string inside the quotes.
System.out.printf();  --> It provides string formatting (similar to printf in C/C++ programming).

Here,
-> "System" is a class.
-> "out" is a public static field: it accepts output data.
 */
package J1_IntroductionToJava.CJ4_InputOutput;

public class Output {
    public static void main (String[] args){
        System.out.println("Java programming is interesting ");
    }
}
