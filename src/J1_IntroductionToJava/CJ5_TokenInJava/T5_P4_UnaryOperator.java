package J1_IntroductionToJava.CJ5_TokenInJava;

public class T5_P4_UnaryOperator {
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println("a = "+a);
        System.out.println(" ");
        System.out.println("PrePost Increment ");
        System.out.println(a++); //10 (11)
        System.out.println(++a); //12

        System.out.println("____________ ");

        System.out.println("PrePost Decrement ");
        System.out.println(a--); //12 (11)
        System.out.println(--a); //10
    }
}
