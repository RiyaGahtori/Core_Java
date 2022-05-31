                                                                      /*           tokens In Java           */
/*
=> These are the smallest element of the Java program. In Java, evey statements and expressions are made up of tokens.
=> The Tokens are the small building blocks of a Java program that are meaningful to the Java compiler.
The Java compiler translates these tokens into Java bytecode. Further, these bytecodes are executed inside the interpreted Java environment.
 */

//For example,
package J1_IntroductionToJava.CJ5_TokenInJava;

public class T1_JavaTokens {
    public static void main(String[] args)
    {
        int a = 10, b=20;
        int c = a+b;
        System.out.println(c);
    }
}
/* In the above code snippet, public, class, T1_JavaTokens, {, static, void, main, (, String, args, [, ], ), System, ., out, println, =, +, int, a, b etc. are the Java tokens.

=> Types of Tokens
1. Keywords    : int, static, void
2. Identifiers : variable_name(a, b, c), method_name(main), class_name(T1_JavaTokens)
3. Literals    : 10
4. Operators   : +, =
5. Separators  : ; , . () {} :
6. Comments    :
-> Line Oriented: It begins with a pair of forwarding slashes (//).
-> Block-Oriented: It begins with /* and continues until it founds */


