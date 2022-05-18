                                                 /*         What is Java?      */
/*
=> Java is a general-purpose, class-based, object-oriented programming language developed by James Gosling, who is known as the father of Java, in 1995.
=> The principles for creating Java programming were :
Simple, Robust, Portable, Platform-independent, Secured, High Performance, Multithreaded, Architecture Neutral, Object-Oriented, Interpreted, and Dynamic".
=> James Gosling - founder of java
=> Java applications are called WORA (Write Once Run Anywhere).
This means a programmer can develop Java code on one system and can expect it to run on any other Java-enabled system without any adjustment. This is all possible because of JVM.
In Java, the program is not converted to code directly understood by Hardware, rather it is converted to bytecode(.class file), which is interpreted by JVM,
so once compiled it generates bytecode file, which can be run anywhere (any machine) and hence it gets the nature of Write Once and Run Anywhere.
 */

                                                 /*       History of Java       */
/*
1) James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991. The small team of sun engineers called Green Team.
2) Java team members(also known as Green Team), initiated this project to develop a language for digital devices such as set-top boxes, televisions, etc.
However, it was best suited for internet programming.
3) Firstly, it was called "Greentalk" by James Gosling, and the file extension was .gt.
4) After that, it was called Oak and was developed as a part of the Green project.
-> Why Java was named as "Oak"?
Oak is a symbol of strength and chosen as a national tree of many countries like the U.S.A., France, Germany, Romania, etc. and it was already a trademark by Oak Technologies.
5) In 1995, Oak was renamed as "Java".
-> Why Java Programming named "Java"?
Java is an island in Indonesia where the first coffee was produced(called Java coffee).It is a kind of espresso bean.
Java name was chosen by James Gosling while having a cup of coffee nearby his office. Since Java was so unique, most of the team members preferred Java than other names.
6) Initially developed by James Gosling at Sun Microsystems (which is now a subsidiary of Oracle Corporation) and released in 1995.
7) JDK 1.0 was released on January 23, 1996 by Sun Microsystems. After the first release of Java, there have been many additional features added to the language.
Now Java is being used in Windows applications, Web applications, enterprise applications, mobile applications, cards, etc. Each new version adds new features in Java.
*/

                                                 /*        Flavours of java     */
/*
According to the SunMicroSystem java is available in 3 flavors
[1] Standard edition  (Core Java)         :    which is used for developing Standalone Applications.
                                                     It is also known as J2SE,JSE.
[2]Enterprise edition (Advance Java)      :    which is used for developing web applications.
                                                     It is also known as J2EE,JEE.
[3]Macro edition      (Android Java)      :    which is used for developing device programs and mobile applications
                                                     It is also known as J2ME,JME.
 */

                                                 //Syntax :
                                                 package J1_IntroductionToJava.CJ1_BasicsofJava;

                                                 public class B2_WhatIsJava {
                                                     public static void main(String[] args){
                                                         System.out.println("Hello World");
                                                     }
                                                 }


                                                 /*         features of Java      */
/*
1.  Simple   : Java is designed to be easy to learn. If you understand the basic concept of OOP Java, it would be easy to master.
2.  Robust   : Java is capable of handling run-time errors, supports automatic garbage collection and exception handling, and avoids explicit pointer concept.
3.  Portable : Java code can execute on all major platforms because it facilitates you to carry the Java bytecode to any platform. It doesn't require any implementation.
4.  Platform-independent : Java code can be executed on multiple platforms, for example, Windows, Linux, Sun Solaris, Mac/OS, etc. Java code is compiled by the compiler and converted into bytecode.
This bytecode is a platform-independent code because it can be run on multiple platforms, i.e., Write Once and Run Anywhere (WORA).
5.  Secured   : Java is best known for its security. With Java, we can develop virus-free systems.
Java is secured because:
-- No explicit pointer
-- Java Programs run inside a virtual machine sandbox
-- Classloader - Classloader in Java is a part of the Java Runtime Environment (JRE) which is used to load Java classes into the Java Virtual Machine dynamically.
 It adds security by separating the package for the classes of the local file system from those that are imported from network sources.
-- Bytecode Verifier - It checks the code fragments for illegal code that can violate access rights to objects.
-- Security Manager  - It determines what resources a class can access such as reading and writing to the local disk.
6.  High Performance : With the use of Just-In-Time compilers, Java enables high performance.
7.  Multithreaded    : A thread is like a separate program, executing concurrently. We can write Java programs that deal with many tasks at once by defining multiple threads.
The main advantage of multi-threading is that it doesn't occupy memory for each thread. It shares a common memory area. Threads are important for multi-media, Web applications, etc.
8.  Architecture Neutral : Java is Platform Neutral because the same Java code will run on multiple platforms (Operating Systems) without modification,
 provided that the code does not intentionally put any specific demands on the system.
9.  Object-Oriented  : Everything in Java is an object.  Java can be easily extended since it is based on the Object model.
10. Interpreted : Java can be considered both a compiled and an interpreted language because its source code is first compiled into a binary byte-code.
This byte-code runs on the Java Virtual Machine (JVM), which is usually a software-based interpreter.
11. Dynamic     : Java is considered dynamic because of Bytecode. The source code which is written in one platform that code can be executed in any platform.
It loads the class file during runtime only. Hence, anything that happens in runtime is dynamic.
 */



