                                                                     /*     Output  (System.out.print())   */
/*
System.out.println();

=> System.out: This is the standard output stream that is used to produce the result of a program on an output device like the computer screen.
Here,
-> "System" is a pre-defined class.
System is available in java.lang package (lang package is a default package which is imported in every program of java. this is also known as heart of java)
-> "out" is a public static field: it accepts output data (out is static member of system class).

=> print : print is a pre-defined method (which is used to print any expression in console)

  Various print functions that we use to output statements:
-> print(): This method in Java is used to display a text on the console. This text is passed as the parameter to this method in the form of String. It prints string inside the quotes.
This method prints the text on the console and the cursor remains at the end of the text at the console (The next printing takes place from just here).
Syntax: System.out.print(parameter);

-> println(): This method in Java is also used to display a text on the console. It prints string inside the quotes similar like print() method.
It prints the text on the console and the cursor moves to the start of the next line at the console (The next printing takes place from the next line).
Syntax: System.out.println(parameter);

-> printf(): This is the easiest of all methods as this is similar to printf in C. This is used to format the output in Java.
*** Note : System.out.print() and System.out.println() take a single argument, but printf() may take multiple arguments. */



package J1_IntroductionToJava.CJ4_InputOutput;

public class I1_Output
{
    public static void main(String[] args)
    {
        //Printing Variables and Literals
        Double number = -26.10;
        System.out.println(21);
        System.out.println(number);

        System.out.println("_____________________________________________________________________");

        //Print Concatenated Strings
        double num = -10.06;
        System.out.println("I am " + "awesome."); //Here, we have used the + operator to concatenate (join) the two strings: "I am " and "awesome.".
        System.out.println("Number = " + num); //Here, first the value of variable num is evaluated. Then, the value is concatenated to the string: "Number = ".

        System.out.println("_____________________________________________________________________");

        // using print() : All are printed in the same line
        System.out.print("Hii! ");
        System.out.print("Hii! ");
        System.out.print("Hii! ");

        System.out.println("_________");

        // using println() : All are printed in the different line
        System.out.println("Hii! ");
        System.out.println("Hii! ");
        System.out.println("Hii! ");
        System.out.println("Java programming is interesting.");

        System.out.println("_________");

        //using printf()
        int x = 100;
        System.out.printf("Printing simple" + " integer: x = %d\n", x);

        System.out.printf("Formatted with" + " precision: PI = %.2f\n", Math.PI); // this will print it upto 2 decimal places

        float n = 5.2f;
        System.out.printf("Formatted to " + "specific width: n = %.4f\n", n); // automatically appends zero to the rightmost part of decimal

        n = 2324435.3f;
        System.out.printf("Formatted to " + "right margin: n = %20.4f\n", n); // here number is formatted from right margin and occupies a width of 20 characters
    }
}
