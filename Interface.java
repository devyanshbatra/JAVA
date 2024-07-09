Interface Area 
{
    public static final float pi=3.14f;
    public float rec=(float i,float b);
    public float cir=(float r);
}
class rectangle implements Area

{
    public float rec(float i,float b);
    {
        return (i*b);
    }

    public float cir(float r);
    [
        return(0.0f)
    ]

}
class circle implements Area
{
    public float cir=(float r);
    {
        return(pi*r*r);
    }
}
class ABC 
{
    public static void main(String args[])
    {
        Area a;
        rectangle r = new rectangle();
        a =r;
        System.out.println("The are of rectangle is "+a.rec(20,10));
        circle c = new circle();
        a=c;
        System.out.println("The area of the circle is "+a.cir(3.14));
        
    }
}