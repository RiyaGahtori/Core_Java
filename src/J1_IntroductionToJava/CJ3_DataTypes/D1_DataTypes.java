                                                                  /*       Data Types in Java       */
/*
Data types in Java specify how the values of that data type are stored in memory and what operations can be performed on the data.
=> There are two types of data types in Java:
Primitive data types     : The primitive data types include boolean, char, byte, short, int, long, float and double.
Non-primitive data types : The non-primitive data types include Classes, Interfaces, and Arrays.
 */

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
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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







 */







package J1_IntroductionToJava.CJ3_DataTypes;

public class D1_DataTypes {
}
