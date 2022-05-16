                                         /*    JDK, JRE and JVM      */
/*
1. Java Development Kit (JDK)
JDK is a software development environment used for developing Java applications and applets. It physically exists.
It contains -
-- development tools(to provide an environment to develop your java programs).
-- JRE(to execute your java program)

2. Java Runtime Environment (JRE)
JRE is an installation package that provides an environment to only run(not develop) the java program(or application)onto your machine. It physically exists.
JRE is only used by those who only want to run Java programs that are end-users of your system.
It contains -
-- set of libraries
-- other files that JVM uses at runtime.

3. Java Virtual Machine (JVM)
JVM is a very important part of both JDK and JRE because it is contained or inbuilt in both. It is called a virtual machine because it doesn't physically exist.
Whatever Java program you run using JRE or JDK goes into JVM and JVM is responsible for executing the java program line by line, hence it is also known as an interpreter.
The JVM performs the following main tasks:
-Loads code
-Verifies code
-Executes code
-Provides runtime environment
 */

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

                                               /* Java program compilation and execution process */
/* Java, being a platform-independent programming language, does not work on the one-step compilation.
Instead, it involves a two-step execution,
--> first through an OS-independent compiler;
--> second, in a virtual machine (JVM) which is custom-built for every operating system.

The two principal stages are :
--- Principle 1: Compilation
First, the source (.java) file is passed through the compiler(javac), which then encodes the source code into a machine-independent encoding, known as Bytecode.
The content of each class contained in the source file is stored in a separate ‘.class’ file.

--- Principle 2: Execution
The class files generated by the compiler are independent of the machine or the OS, which allows them to be run on any system.
To run, the main class file (the class that contains the method main) is passed to the JVM and then goes through three main stages before the final machine code is executed.
These states include:
1. ClassLoader - The main class is loaded into the memory bypassing its ‘.class’ file to the JVM, through invoking the latter.
All the other classes referenced in the program are loaded through the class loader.
A class loader, itself an object, creates a flat namespace of class bodies that are referenced by a string name.

2. Bytecode Verifier - After the bytecode of a class is loaded by the class loader, it has to be inspected by the bytecode verifier,
whose job is to check that the instructions don’t perform damaging actions.

3. Just-In-Time Compiler - This is the final stage encountered by the java program, and its job is to convert the loaded bytecode into machine code.
 */
                                         package J1_IntroductionToJava.CJ1_BasicsofJava;

                                         //Main class
                                         public class B1_JdkJreJvm
                                         {
                                             // Main driver method
                                             public static void main(String[] args)
                                             {
                                                 // Print command
                                                 System.out.println("Hello everybody! ");
                                                 System.out.print("I am Riri ");
                                             }
                                         }

/* Commands for compilation and execution =>
1. Save         ->  class-name.java
2. Compilation  ->  javac class-name.java
3. Execution    ->  java class-name
 */
                                         //----------------------------------------------------------//
/* Java Naming Convention =>
--> CamelCase naming conventions - If the name is combined with two words, the second word will start with uppercase letter always.
examples : actionPerformed(), firstName, jenkinsServer, iterationCount, gitRepository

-- PascalCase - Pascal case is always consistent with camel case rules. But the difference is that Pascal case requires the first letter to be uppercase as well, while camel case does not.
examples : OutOfMemoryException, DateFormat, DatabaseConnection, LinkedList, EventHandler, etc.

-- The term "lower camel case" is often used when a variable starts with a lowercase letter (jenkinsServer),
 while "upper camel case" is often used to refer to variables that comply to Pascal case rules (JenkinsServer).

 **=> Java follows lower camel-case syntax for naming the Method, Package, and Variable.
 **=> Java follows upper camel-case syntax for naming the Class, Interface, and Constant.
 */
