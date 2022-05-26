                                                            /*       Data Types in Java       */
/*
Data types in Java specify how the values of that data type are stored in memory and what operations can be performed on the data.
Data type defines the values that a variable can take, for example if a variable has int data type, it can only take integer values.
Example : int num; (So in order to use the variable num in our program, we must declare it)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
=> Java is a statically typed language. A language is statically typed, if the datatype of a variable is known at compile time.
This means that you must specify the type of the variable (Declare the variable) before you can use it.

=> There are majorly two types of languages :
1. Statically typed languages  : where each variable and expression type is already known at compile time.
Once a variable is declared to be of a certain data type, it cannot hold values of other data types. For example C, C++, Java.
2. Dynamically typed languages : These languages can receive different data types over time. For example Ruby, Python

=> Java is statically typed and also a strongly typed language because, in Java,each type of data (such as integer, character, hexadecimal, packed decimal, and so forth)
is predefined as part of the programming language and all constants or variables defined for a given program must be described with one of the data types.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

=> There are two types of data types in Java:
Primitive data types     : The primitive data types include boolean, char, byte, short, int, long, float and double.
Non-primitive data types : The non-primitive data types include Classes, Interfaces, and Arrays.
 */

package J1_IntroductionToJava.CJ3_DataTypes;

public class D1_DataTypesInJava {
    public static void main(String[] args)
    {
        int num; //Declaring int
        num = 21; //initializes a variable num
        System.out.println("The value of num is : "+num); //print the value of num
    }
}

