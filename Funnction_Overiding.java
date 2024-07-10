public class ABC {
   public void callme()
   {
    System.out.println("Call me using abc");
   }
    
}
class XYZ extends ABC   
{
    public void callme()
    {
        System.out.println("Call me using XYZ");
    }
} 
class LMN extends XYZ
{
    public void callme()
    {
        System.out.println("call me using LMN");
    }
}
class Java
{
    public static void main(String[] args)
    {
        ABC a1 = new ABC();
        XYZ x1 = new XYZ();
        LMN l1 = new LMN();
        ABC a;
        a=a1;
        a.callme();
        a=x1;
        a.callme();
        a=l1;
        a.callme();
    }
}