import java.util.*
class Stock { 
     private string iname;
     private int qty;
     private float rate,value;
public void input()
{
  Scanner sc = new Scanner(system.in);
  System.out.println("Enter the name of the item");
  iname = s.next();
  System.out.print("Enter the rate of the item");
  rate = sc.nextInt();
  System.out.println("Enter the quantity of the item");
  quantity = sc.nextInt();

}
public void process()
{
    value = qty*rate;
}
public void display()
{
    System.out.println("The value of the item purchased is "+value);
}

}
