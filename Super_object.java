 class ABC  {
    public int n;
    public void show()
    {
        System.out.println("ABC"+n);
    }
    
}
class XYZ extends ABC
{
    public int n;
    public XYZ(int a,int x1)
    {
      super.n=a;
      super.n=x1;
    }
    public void show()
{
    super.show();
    System.out.println("Super.n"+n);
}
}    
class LMN
{
    public static void main(String args[])
    {
        XYZ X = new XYZ(10,20);
        X.show();
    }
}