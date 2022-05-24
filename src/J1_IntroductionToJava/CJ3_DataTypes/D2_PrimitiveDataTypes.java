
                                                                  /*       Primitive Data Types       */
/*
Primitive data types specify the size and type of variable values. They are the building blocks of data manipulation.
=> There are 8 types of primitive data types:
1. byte data type
2. short data type
3. int data type
4. long data type
5. float data type
6. double data type
7. char data type
8. boolean data type
*/

package J1_IntroductionToJava.CJ3_DataTypes;

public class D2_PrimitiveDataTypes {
    public static void main(String[] args)
    {
        //Integer
        int a = 10;
        short s = 2;
        byte b = 6;
        long l = 125362133223L;

        System.out.println("The integer variable is " + a );
        System.out.println("The short variable is " + s );
        System.out.println("The byte variable is " + b );
        System.out.println("The long variable is " + l);
        System.out.println("______________________________________");

        //Floating Point
        float f = 65.20298f;
        double d = 876.765d;

        System.out.println("The float variable is " + f);
        System.out.println("The double variable is " + d);
        System.out.println("______________________________________");

        //Char Data Type
        char var1 = 'A';
        char var2 = 'd';
        System.out.println(var1);
        System.out.println(var2);
        System.out.println("______________________________________");

        //Boolean Data Type
        boolean var = true;
            System.out.println("Boolean value is " + var);
    }
}

/*__________________________________________________________________________________________________________________________________________________________________________________________________
=> Integers : An integer stores a whole number with no fractional or decimal places. There are four integer types in Java – byte, short, int, long.

-> Byte Data Type : It is an 8-bit signed two’s complement integer. It stores whole numbers ranging from -128 to 127. Its default value is 0.
The byte data type is used to save memory in large arrays where the memory savings is most required. It saves space because a byte is 4 times smaller than an integer.

Example:
byte a = 21, byte b = -99

-> Short Data Type : It is a 16-bit signed two’s complement integer. It stores whole numbers with values ranging from -32768 to 32767. Its default value is 0.
The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.

Example:
short s = 10000, short r = -5000

-> Int Data Type : It is a 32-bit signed two’s complement integer which stores integral values ranging from 2147483648 (-2^31) to 2147483647 (2^31 -1). Its default value is 0.
The int data type is generally used as a default data type for integral values unless if there is no problem about memory.

Example:
int a = 100000, int b = -200000

-> Long Data Type : The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1).
Its default value is 0L. This data type ends with ‘L’ or ‘l’.
The long data type is used when you need a range of values more than those provided by int.

Example:
long a = 100000L, long b = -200000L

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
=> Floating Point : Floating-point is used for expressions involving fractional precision. It has two types: float and double.

-> Float Data Type : The float data type is a single-precision 32-bit IEEE 754 floating point. It stores the values including their decimal precision. It can have a 7 digit decimal precision.
Its default value is 0.0F. Float Data Type ends with an ‘f’ or ‘F’.Its value range is unlimited (3.4e-038 to 3.4e+038).
It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values,such as currency.

Example:
float f1 = 234.5f

-> Double Data Type : The double data type is a double-precision 64-bit IEEE 754 floating point. It can have a 15 digit decimal precision.
Its default value is 0.0d. Its value range is unlimited (It stores fractional numbers ranging from 1.7e-308 to 1.7e+308).
The double data type is generally used for decimal values just like float. The difference between the two is that is double twice the float. It should not be used for precise values,such as currency.

Example:
double d1 = 12.3

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
=>Char Data Type : The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 ).
The char data type is used to store a single characters. The character store both lower case and upper case characters which must be enclosed in single quotes.

Example:
char char =’a’;
char letter = 'A'

Syntax : Character ch = new Character(‘a’)

Question : Why char uses 2 byte in java and what is \u0000 ?
Answer   : It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
=> Boolean Data Type :
A boolean data type stores only two values true and false. Typically, it is used as a flag variable to track true or false conditions.
The Boolean data type specifies one bit of information, but its "size" can't be defined precisely.

Example :
Boolean one = false

Syntax : boolean variable_name = true/false;
____________________________________________________________________________________________________________________________________________________________________________________________________*/

/*
________________________________________________________________________________________________________________________
Data Type	       Default Value	       Default size	          Range
________________________________________________________________________________________________________________________
byte	           0	                   1 byte or 8 bits	     -128 to 127
short	           0	                   2 bytes or 16 bits	 -32,768 to 32,767
int	               0	                   4 bytes or 32 bits	 2,147,483,648 to 2,147,483,647
long	           0	                   8 bytes or 64 bits	 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	           0.0f	                   4 bytes or 32 bits	 1.4e-045 to 3.4e+038
double             0.0d                    8 bytes or 64 bits	 4.9e-324 to 1.8e+308
char	          ‘\u0000’	               2 bytes or 16 bits	 0 to 65536
boolean	           FALSE	               1 byte or 2 bytes	 0 or 1
*/
