package J1_IntroductionToJava.CJ5_TokenInJava;

public class T5_P5_LogicalOperator {
    public static void main(String[] args)
    {
        System.out.println("LOGICAL AND ");
        System.out.println((10>5) && (2>1)); //True
        System.out.println((10>5) && (2<1)); //False
        System.out.println((10<5) && (2<1)); //False

        System.out.println("_________________________");
        System.out.println("LOGICAL OR ");
        System.out.println((10>5) && (2>1)); //True
        System.out.println((10>5) && (2<1)); //True
        System.out.println((10<5) && (2<1)); //False

        System.out.println("_________________________");
        System.out.println("LOGICAL NOT ");
        System.out.println(! (10>5)); //False
        System.out.println(! (10<5)); //True
    }
}
