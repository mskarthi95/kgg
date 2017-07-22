import java.util.*;
import static java.lang.System.*;
class A
{
    int value=1;
}
class B extends A{
   int value=2;

}
class C extends B{
    int value=3;
}
class D extends C{
    int value=4;
}
class Sample1
{
    public static void main(String args[])
    {
        C go=new D();
        System.out.println(go.value);
         go=new C();
        System.out.println(go.value);
    }
}