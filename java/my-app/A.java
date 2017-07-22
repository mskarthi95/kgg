interface B
{
    int z=1000;
    void display()
    {
        System.out.println(z);
    }

}
class A extends B
{
    public static void main(String args[])
    {
        B a=new B();
        //{
          // int z=1000;
    /*void display()
    {
        System.out.println(z);
    } 
        };*/
        a.display();
    }
}