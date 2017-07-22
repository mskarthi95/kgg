class Phonemain
{
    public static void main(String args[])
    {
        PhoneBuilder b=new PhoneBuilder.setOs("mac").getPhone();
        System.out.println(b);
    }
}