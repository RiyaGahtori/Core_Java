//1.	Write a program to perform input/output of all basic data types.
package J1_IntroductionToJava.CJ4_InputOutput.PracticeQuestions;

public class P1 {
    public static void main (String[] args)
    {
        /* Declare all primitive Data Types --> char, byte,  short, int, long, float, double and boolean.*/
        //Java Characters
        char myChar = 'R';//A character is used to store a ‘single’ character  -->Size: 2 bytes(16 bits).
        //Java Integers
        byte myByte = 21;//Size: 1 byte(8 bits)
        short myShort = 3000;//Size: 2 bytes (16 bits)
        int myNum = 100000;//Size: 4 bytes (32 bits)
        long myLong = 110000000000L;//Size: 8 bytes (64 bits)
        //Java Floating-Point Types
        float myFloat = 21.3f;//Size: 4 bytes (32 bits)
        double myDouble = 21.123456789d;//Size: 8 bytes (64 bits)
        //Boolean Types
        boolean myBool = true;// It is capable of storing only two possible values i.e., true and false.

        /* Print the value of all variables */
        System.out.println("Character : " + myChar);
        System.out.println("Byte : " + myByte);
        System.out.println("Short : " + myShort);
        System.out.println("Number :" + myNum);
        System.out.println("Long : " + myLong);
        System.out.println("Float : " + myFloat);
        System.out.println("Double : " + myDouble);
        System.out.println("Boolean data type is : " + myBool);
        System.out.println("----------------------------------");

        /* Declaration of non-primitive data types  --> Strings, Arrays*/
        //Java Strings
        String string = "Riri";//String <String_variable_name> = “<sequence_Of_Strings>” ;
        //Java Arrays
        /* Creating an array involves two steps which are:
        1. Array Declaration
        --> The valid syntax for array declaration can be:
             data-type array_name [ ];
             data-type [ ] array_name;
        2. Array Initialization
        --> The valid syntax for array initialization can be:
              array_name = new data-type [size of array];
              array_name = new data-type {elements of array using commas};
        */
        int [ ] marksOfStudents = new int[ ] {65, 90, 78, 60, 84 };
        // Java Classes



        /* Print the value */
        System.out.println(string);
        System.out.println("Marks of first student: " +marksOfStudents[0]);
        System.out.println("Marks of second student: " +marksOfStudents[1]);
        System.out.println("Marks of third student: " +marksOfStudents[2]);
        System.out.println("Marks of fourth student: " +marksOfStudents[3]);
        System.out.println("Marks of fifth student: " +marksOfStudents[4]);
        System.out.println("----------------------------------");
    }
}
