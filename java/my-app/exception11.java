class exception11
{
    public static void main(String args[])
    {
        int a=0,b=0,c;
        c=a%b;
        try{
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("wrong");
        }
        catch(Exception e)
        {
            System.out.println("correct");
        }
    }
}