                                                                      /*          Separator In Java          */
/*
=> separator  <= ; | , | . | ( | ) | { | } | [ | ]
Note : the first three separators (; , and .) are tokens that separate other tokens, and the last six (3 pairs of braces) separators are also known as delimiters.
For example : Math.pow(9, 3); contains nine tokens.

    -> Square Brackets []: It is used to define array elements. A pair of square brackets represents the single-dimensional array, two pairs of square brackets represent the two-dimensional array.
    -> Parentheses (): It is used to call the functions and parsing the parameters.
    -> Curly Braces {}: The curly braces denote the starting and ending of a code block.
    -> Comma (,): It is used to separate two values, statements, and parameters.
    -> Assignment Operator (=): It is used to assign a variable and constant.
    -> Semicolon (;): It is the symbol that can be found at end of the statements. It separates the two statements.
    -> Period (.): It separates the package name form the sub-packages and class. It also separates a variable or method from a reference variable.
 */
package J1_IntroductionToJava.CJ5_TokenInJava;

public class  T6_Separators {
    public static void main(String[] args)
    {
        int i, j = 10, k = 11;    // uses comma or , separator

        for (i = 0; i < j; i++)   // uses parentheses or () separator
        {                     // uses braces or {} separator
            System.out.println("I am " + i);
        }
        System.out.println(k + " is biggest here.");
    }
}