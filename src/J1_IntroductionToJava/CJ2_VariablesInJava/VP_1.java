package J1_IntroductionToJava.CJ2_VariablesInJava;

public class VP_1
{
    static int r = 21; //static variable
    void fun()
    {
        int i = 21;   //local variable
        System.out.println(r+"  "+i);
        ++r; ++i;
    }
    public static void main(String[] args)
    {
        VP_1 ri = new VP_1();//creating object of class VP_1
        ri.fun();//calling "fun" method using reference ri
        ri.fun();
        ri.fun();
    }
}

/*
Output :
21  21
22  21
23  21

Explanation :
=> The scope of local variables remains in memory as long as the method executes, and it is created every time function is called.
After the first call memory is destroyed and in 2nd call new memory is created again. therefore, output value remains same(21).
(1st time when fun method is called value is increased by 1 (21) and after the method ends memory is destroyed and new memory is created in 2nd call)

=>Static variables remains in memory as long as program executes. (In static variable memory is created once)
 */

