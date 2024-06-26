import java.util.*;
class Result
{
private String name;
private int roll_no;
private int clas;
private int maths;
private int English;
private int science;
private float total;
private float percentage;
 
public void input()
{
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the name of the student");
 name = sc.next();
 System.out.println("Enter the class of the student");
 clas= sc.nextInt();
 System.out.println("Enter the marks in maths");
 maths = sc.nextInt();
 System.out.println("Enter the marks in English");
 English = sc.nextInt();
 System.out.println("Enter the marks in science"); 
 science = sc.nextInt();
}
public void process()
{
 total = English+science+maths;
 percentage = total/300*100;
}
public void display()
{
 System.out.println("The name of the student is " +name +"  from class  " +clas+"  has got total of  " + total+"has got the percentgae of " +percentage);
}

}
class ABC
{
public static void main(String[] args) {
Result l1 = new Result();
Result l2 = new Result();
l1.input();
l1.process();
l1.display();
}
}