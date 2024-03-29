                                                                         /*             Java Keywords             */
/*
=> Keywords are special tokens that add a different meaning to the language compiler. Each keyword has its own individual function and performs a specific task assigned to it.

=> It is always written in lower case.

=> Java keywords are also known as reserved words because These are the pre-defined reserved words of any programming language.
 These are predefined words by Java, so they cannot be used as a variable, object name, class name, or any other identifiers ( as they are part of the Java programming language syntax).

=> In Java, we have 50 such reserved words, out of which 48 are in use and 2 are reserved but not in use (for future use [goto*, const*]).
-> Future use: goto*,const*
 * 1.2V : assert**
 * 1.4V : strictfp***
 * 5.0V : enum****

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
=>Java Keywords or Reserved Words for jdk1.4

abstract	         default	 goto*	     package             this
assert**             do	         if	         private	         throw
boolean	             double	     implements	 protected	         throws
break	             else        import	     public		         transient
byte	             enum****    instanceof	 return              true
case		         extends	 int	     short	             try
catch		         false	     interface   static	             void
char		         final		 long	     strictfp***	     volatile
class		         finally	 native		 super			     while
const*		         float	     new		 switch
continue		     for		 null		 synchronized

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

                                                                         package J1_IntroductionToJava.CJ5_TokenInJava;

                                                                         public class T2_Keywords {
                                                                             public static void main(String[] args){
                                                                                 System.out.println("--> Keywords for data types are               : boolean, byte, char, int, long, short, float, double.");
                                                                                 System.out.println("--> Keywords for access control are           : private, protected, public.");
                                                                                 System.out.println("--> Keywords for modifiers are                : abstract, final, native, private, protected, public, static, transient, synchronized, volatile, strictfp.");
                                                                                 System.out.println("--> Keywords for catch-exception are          : try, catch, finally, throw.");
                                                                                 System.out.println("--> Keywords for loops or decision-makers are : break, case, continue, default, do, while, for, switch, if, else.");
                                                                                 System.out.println("--> Keywords for class functions are          : class, extends, implements, import, instanceof, new, package, return, interface, this, throws, void, super.");
                                                                                 System.out.println("--> Keywords for assigned values are          : true, false, null.");
                                                                                 System.out.println("--> Outdated keywords are                     : const, goto.");
                                                                             }
                                                                         }

/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. abstract     : A non-access modifier. Used for classes and methods: An abstract class cannot be used to create objects (to access it, it must be inherited from another class).
                  An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)
               => Java abstract keyword is used to declare an abstract class. An abstract class can provide the implementation of the interface. It can have abstract and non-abstract methods.
               => For example: abstract class DataFlair

2. assert       : For debugging
               => Using the assert keyword we can implement assertion in a program. Using it we can check the correctness of any assumptions made in a program. The assert keyword was added in JDK 1.4.
               => For Example: int i = 10;
                               assert i > 5 : "The value is greater than 5";

3. boolean      : A data type that can only store true and false values
               => Using the boolean keyword we can declare a boolean variable. A boolean variable is a variable that has two values, true and false.
               => For example: boolean flag = true;

4. break        : Breaks out of a loop or a switch block
               => The break keyword is a jump statement using which we can break out of a loop or switch statement. The break statement terminates the currently executing block of code.
               => For example: i=0;
                               while(true)
                               {
                                    if(i==10)
                                    break;
                                    i++;
                               }

5. byte         : A data type that can store whole numbers from -128 and 127
               => Using the byte keyword in java we can declare a variable that can hold a value of 1 byte or 8 bit.
               => For example: byte num=1;

6. case         : Using the case statement we can declare each case inside a switch-case block.
               => For example: {
                                    case 1:
                                               System.out.println(“ONE”);
                                               break;
                               }

7. catch        : Catches exceptions generated by try statements
               => The catch keyword is part of exception handling in java. Using the catch keyword we can catch or capture the error caught by the try block. A catch block can exist only after the try block.
               => For Example: catch (Exception e)
                               {
                                      System.out.println(“An exception was caught by the try block”);
                               }

8. char         : Using the char keyword we can declare a character variable.
               => For example: char ch=’A’;

9. class        : Using the class keyword we can declare a class in java.
               => For example: class DataFlair

10. continue    : Continue is also a jump statement in java. Using it we can terminate the current iteration and continue from the next iteration inside the loop.
               => For example: i=0;
                               while(i<=10)
                               {
                                    if(i==5)
                                    continue;
                                    i++;
                               }

--> const	    : Defines a constant. Not in use - use final instead

11. default     : default is the keyword using which we can declare the default statement inside a switch case. It is executed when none of the cases match.
               => For Example: Switch(num)
                               {
                                    case 1:
                                              System.out.println(“ONE”);
                                              break;
                                    default:
                                              System.out.println(“Not ONE”);
                               }

12. do          : Using the do keyword we can declare a do-while loop. It is an exit controlled loop, so it doesn’t have any entry condition.
               => For example: i=0;
                               do{
                                       i++;
                                       }while(i<=10);

13. double      : Using the double keyword we can declare a double variable. A double variable can hold a 64bit long floating point number.
               => For Example: double d= 1.23456;

14. else        : Used in conditional statements
               => Using the else keyword we can write statements that will be executed when the if block doesn’t execute successfully.
               => For example: i=5;
                               if(i!=5)
                               System.out.println(“Not Five”);
                               else
                               System.out.println(“FIVE”);

15. enum        : Using the enum keyword we can declare an enumerated class. It consists of a fixed set of constants. Enum constructors are always private by default. Enum keyword was added to java in JDK 5.0.
               => For Example: enum Rainbow
                               {
                                 Violet, Indigo, Blue, Green, Yellow, Orange, Red;
                               }

--> exports     : Exports a package with a module. New in Java 9

16. extends     : extend keyword is used in inheritance. Using it we can inherit one class into another.
               => For Example: class subclass extends superclass

17. final       : A non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override)
               => Using the final keyword we can finalize the value of a variable. It means that the value cannot be updated by the user whatsoever.
               => For example: final int num = 1000;


18. finally     : The finally keyword is used after the try-catch block. It indicates the end of the block.
                  Unlike the try-catch block, the finally block will be executed regardless of whether an exception is found or not.
               => For Example: finally{
                               System.out.println("This block is always executed whatsoever!");
                               }

19. float       : A data type that can store whole numbers from 3.4e−038 to 3.4e+038
               => Using the float keyword we can declare a float variable in java. The float variable holds a 32-bit long floating-point number.
               => For example: float num= 1.324f;

20. for         : Using the for keyword we can declare a for loop. It is an entry controlled loop, for this kind of loop the number of iterations should be known beforehand.
               => For example: for(i=0;i<10;i++)
                               {
                                   System.out.println(i);
                               }

21. if          : In java, if keyword is used to declare if conditional statement. The if statement is used to check the viability of a condition.
               => For Example: i=5;
                               if(i==5)
                               {
                                   System.out.println(“The Number is Five”);
                               }

22. implements  : Using the implements keyword in java we can declare an interface. It is like inheritances extend keyword, here to access an interface we have to use the implements keyword.
               => For Example: interface DataFlair{
                               public void intern();
                               }
                               class internship implements DataFlair
                               {
                                       Public void intern()
                                      {
                                               System.out.println(“Internship Granted”);
                                       }
                               }

23. import      : Using the import keyword in java we can access classes and interfaces present inside a package to the current code.
               => For Example: import java.util.Arrays;

24. instanceof  : Using the instanceof keyword in java we can check whether a given object is an instance of another class or not. It returns true if the given object is an instance and false if not.
               => For Example: public class DataFlair {
                                 public static void main(String[] args) {
                                   DataFlair Obj1 = new DataFlair();
                                   System.out.println(Obj1 instanceof DataFlair);// It will return True.
                                 }
                               }

25. int         : Using the int keyword we can declare a variable of integer datatype. It can hold a value of 32-bit long.
               => For Example: int num=100;

26. interface   : Used to declare a special type of class that only contains abstract methods
               => Using the interface keyword in java we can declare an interface inside the code.
               => For Example: interface DataFlair{}

27. long        : Using the long keyword we can declare variables with long data type. The long data type is integers that can hold 64-bit of data.
               => For Example: long num=100000;

--> module	    : Declares a module. New in Java 9

28. native      : The native keyword in java is used to indicate that a method is implemented in native code using JNI[Java Native Interface].
               => For Example: Public native void DataFlair();

29. new         : Using the new keyword we can create a new instance for a class.
               => For Example: public class DataFlair {
                                 public static void main(String[] args) {
                                   DataFlair Obj1 = new DataFlair();
                               }

30. Package     : Using the package keyword in java we can create a new package in the java library.
               => For Example: package com.DataFlair.Keywords;

31. private     : private keyword is an access modifier that declares a class or method as private; i.e; it can only be accessed by its local variables.
               => For Example: private class DataFlair{}

32. protected   : protected is also an access modifier that declares a class or method as protected; i.e; it can be accessed by files in the PWD(Present Working Directory).
               => For Example: protected class DataFlair{}

33. public      : public is another access modifier that declares a class or method as public; i,e; it can be accessed globally.
               => For Example: public class DataFlair{}

--> requires	: Specifies required libraries inside a module. New in Java 9

34. return      : Finished the execution of a method, and The return keyword is used inside a method when it requires to return a value of a certain return type except void.
               => For Example: int sum(int a, int b)
                               {
                                    return (a+b);
                               }

35. short       : In java, the short keyword declares variables that can hold an integer value of 16-bit long.
               => For Example: short num=1;

36. static      : A non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class
               => In java, the static keyword declares a static variable or method. A static variable or method is stored in a static memory location.
               => For Example: public static void main()

37. strictfp    : In java, strictfp keyword ensures that every platform gets the same result for floating-point operation. The strictfp keyword Restrict the precision and rounding of floating point calculations.
               => This keyword was introduced in JDK 1.2.
               => For Example: strictfp class DataFlair{}

38. super       : Refers to superclass (parent) objects
               => The super keyword distinguishes variables with the same name in both parent class and child class in inheritance.
               => For Example: class DataFlair
                               {
                                    String name=”Company”;
                               }
                               class internship extends DataFlair/
                               {
                                    String name=”Intern”;
                                    System.out.println(name);//Intern will be printed
                                    System.out.println(super.name);//Company will be printed
                               }

39. switch      : Using the switch keyword we can initiate the switch case block in a java code.
               => For Example: Switch(num)
                               {
                                    case 1:
                                              System.out.println(“ONE”);
                                              break;
                                    default:
                                              System.out.println(“Not ONE”);
                               }

40. synchronized: A non-access modifier, which specifies that methods can only be accessed by one thread at a time
               => For Example: synchronized void print(int num)

41. this        : this keyword in java is used to distinguish local variables from global variables.
               => For example: class DataFlair{
                               String name;
                               DataFlair(String name)
                               {
                                    this.name=name;
                               }
                               }

42. throw       : The throw keyword creates a custom error.
               => For Example: throw new IOException("The Input is Not Acceptable”);

43. throws      : Indicates what exceptions may be thrown by a method.
               => For Example: import java.io.*;
                               class DataFlair{
                                void internship()throws IOException{
                                 throw new IOException("Internship Not Found");
                                }
                               }

44. transient   : A non-accesses modifier, which specifies that an attribute is not part of an object's persistent state
               => Using the transient keyword in java we can deserialize a variable. When a variable is declared transient, it is not considered for serialization.
               => For Example: transient int num;

45. try         : Creates a try...catch statement
               => The try block is used in exception handling to test a block of code for exceptions. The try block is always followed by a catch block or finally block.
               => For Example: try{
                               //statement
                               }catch(exception e){}

--> var         : Declares a variable. New in Java 10.

46. void        : Using the void keyword we can declare that the method will not return any value.
               => For Example: void main()

47. volatile    : Indicates that an attribute is not cached thread-locally, and is always read from the "main memory".
               => volatile keyword in java is used to indicate that a variable can change asynchronously.
               => For Example: static volatile int num=100;

48. while       : Using the While keyword we can declare a while loop. While loop is an entry controlled loop, where the number of iterations is not fixed.
               => For example: i=5;
                               while(i<=10)
                               {
                                   i++;
                               }
*/



