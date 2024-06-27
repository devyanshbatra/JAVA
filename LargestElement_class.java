import java.util.*;
class hi
{
    private int a;
    private int b;
    private int c;
    private int l;


 public void input()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
     a =sc.nextInt();
    System.out.println("Enter the value of b");
    b = sc.nextInt();
    System.out.println("Enter the value of c");
    zc = sc.nextInt();


 }
 public void process()
 {
   if(a>b&a>c)
   {
    System.out.println("A is the largest element ");
      l = a;
   }
   else if (a<b & a>c)
   {
    System.out.println("B is the largest element");
     l = b;
   }
   else
   {
    System.out.println("C is the largest element");
      l = c;
   }
 }
 public void display()
 {
    System.out.println("the greatest number is "+l);
 }
}

class XYZ
{
public static void main(String[] args){

hi x = new hi();
x.input();
x.process();
x.display();
}
}


