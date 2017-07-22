import java.util.*;
import static java.lang.System.*;
class A
{
    int value=1;
    A()
    {
        
        System.out.println("a class"+value);
    }
}
class B extends A{
   int value=2;
    B()
    {
        
        System.out.println("b class"+value);
    }

}
class Sample2
{
    public static void main(String args[])
    {
        A go=new A();
        //B go1;
        System.out.println(go.value);
         go=new B();
        System.out.println(go.value);
    }
}
