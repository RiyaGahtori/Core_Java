                                                     /*          Non-Primitive Data Type          */
/*
=> Non-primitive data types or reference data types refer to instances or objects. They cannot store the value of a variable directly in memory. They store a memory address of the variable.
=> Whenever a non-primitive data type is defined, it refers a memory location where the data is stored in heap memory i.e., it refers to the memory location where an object is placed.
Therefore, a non-primitive data type variable is also called referenced data type or simply object reference variable.
An object reference variable lives on the stack memory and the object to which it points always lives on the heap memory. The stack holds a pointer to the object on the heap.

=> Whenever we are passing a non-primitive data type to a method, we are passing the address of that object where the data is stored.

=> Non-primitive data types are user-defined. They are created by programmers and can be assigned with null(default value is null). All non-primitive data types are of equal size.

=> For example,
consider an array that stores a group of values. Class is also a primitive type that stores different methods and variables. Therefore, these are also called as advanced data types in Java.

=> There are five types of non-primitive data types in Java :
1. Class : A class in Java is a user defined data type i.e. it is created by the user. It acts a template to the data which consists of member variables and methods.

2. Object : An object is the variable of the class, which can access the elements of class i.e. methods and variables.

3. String : A string represents a sequence of characters for example "riri", "Hello world", etc. String is the class of Java. (Syntax : String str = "You're the best"; )

4. Array : An array is a data type which can store multiple homogenous variables. They are stored in an indexed manner starting with index 0.

The variables can be either primitive or non-primitive data types.
-> Following example shows how to declare array of primitive data type int:
int [ ] marks;
-> Following example shows how to declare array of non-primitive data type:
Student [ ] students;  (where, Student is the class name and [ ] creates an array of object students.)

5. Interface : An interface is similar to a class however the only difference is that its methods are abstract by default i.e. they do not have body.
An interface has only the final variables and method declarations. It is also called a fully abstract class.

 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

                                                     package J1_IntroductionToJava.CJ3_DataTypes;

                                                     public class D3_NonPrimitiveDataTypes
                                                         {
                                                             // Declaration of a primitive variable.
                                                             String name = "Riri"; // Instance variable.

                                                             public static void main(String[] args)
                                                             {
                                                                 // Creating an object of the class.
                                                                 D3_NonPrimitiveDataTypes sc = new D3_NonPrimitiveDataTypes(); // sc is Non-primitive data type, i.e. Object REFERENCE.
                                                                 // Print the address of the memory location of an Object.
                                                                 System.out.println(sc);
                                                                 System.out.println(" ");

                                                                 // Now we cannot access instance variable directly.
                                                                 // We call instance variable by using reference variable sc which is created above.
                                                                 System.out.println(sc.name);
                                                             }
                                                         }

