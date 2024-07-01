import java.uti.*;
import java.util.Scanner;
public class Books {
    String name;
    static int qty;
    int code;
    
   public Books()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the book");
    name = sc.next();
    System.out.println("Enter the quantity of the book in the library");
    qty = sc.nextInt();
    System.out.println("Enter the code of the book");
    code = sc.nextInt();
}
public void sale()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter sale quantity");
    int sqty=sc.nextInt();
    qty=qty-sqty;

}   

public void purchase()
{
    Scanner sc = new Scanner(System.in);;
    System.out.print("Enter purchase quantity");
    int pqty=sc.nextInt();
    qty=qty+pqty;
}
public void display()
{
System.out.print(code+" "+name+"  "+qty);

}
}
class ASD{
    public static void main (String[] arrgs){

    
    Scanner sc = new Scanner(System.in);

    Books b[]=new Books [5];

    int i;


    for (i=0;i<=4;i++)
    {
        b[i] = new Books();
        b[i].input();
    }
     
    

    System.out.println("sale");
    System.out.println("purchase");
    System.out.println("exit");
    int choice = sc.nextInt();
    if (choice == 1)
    {
        
       b[i].sale();
    }
    
    else if(choice == 2)
    {
        b[i].purchase();
    }
    else
    {
        System.out.println("EXIT");
    }
   
}
}


