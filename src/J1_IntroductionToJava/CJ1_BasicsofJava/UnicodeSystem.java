                                                                       /*    Unicode System   */
/*
=> Computer systems internally store data in binary representation. A character is stored using a combination of 0's and 1's. The process is called encoding
 A character encoding scheme is important because it helps to represent the same information on multiple types of devices.
=>  Types of Encoding :

Following are the different types of encoding used before the Unicode system.
1. ASCII (American Standard Code for Information Interchange) for the United States.
2. ISO 8859-1 for Western European Language.
3. KOI-8 for Russian.
4. GB18030 and BIG-5 for chinese.
5. Base64 used for binary to text encoding.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
=> What is Unicode System?
-> Unicode system is an international standard character encoding technique that is capable of representing most of the world's written languages.
-> Hexadecimal values are used to represent Unicode characters.

-> There are multiple Unicode Transformation Formats:
UTF-8: It represents 8-bits (1 byte) long character encoding.
UTF-16: It represents 16-bits (2 bytes) long character encoding
UTF-32: It represents 32-bits (4 bytes) long character encoding.

-> To access a Unicode character the format starts with an escape sequence \u followed by 4 digits hexadecimal value.
-> A Unicode character has a range of possible values starting from \u0000 to \uFFFF.

-> Some of the Unicode characters are
\u00A9 represent the copyright symbol - ©
\u0394 represent the capital Greek letter delta - Δ
\u0022 represent a double quote - "
------------------------------------------------------------------------------------------------------------------------------------------------------------------
=> Why java uses Unicode System?
-> This caused two problems:
1) A particular code value corresponds to different letters in the various language standards.
2) The encodings for languages with large character sets have variable length.Some common characters are encoded as single bytes, other require two or more byte.

-> To solve these problems, a new language standard was developed i.e. Unicode System.
In unicode, character holds 2 byte, so java also uses 2 byte for characters.
~> lowest value:\u0000
~> highest value:\uFFFF
 */


                                                                       //Program to convert UTF-8 to Unicode
                                                                       package J1_IntroductionToJava.CJ1_BasicsofJava;
                                                                       import java.nio.charset.StandardCharsets;

                                                                       public class UnicodeSystem
                                                                       {
                                                                           public static void main(String[] args) throws Exception
                                                                           {
                                                                               String str1 = "Unicode System\u00A9";
                                                                               byte[] charset = str1.getBytes(StandardCharsets.UTF_8);
                                                                               String newstr = new String(charset, StandardCharsets.UTF_8);
                                                                               System.out.println(newstr);
                                                                           }
                                                                       }



