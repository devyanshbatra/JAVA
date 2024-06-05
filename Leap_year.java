import java.util.*;
public class Leap_year{
    public static void main (String args[] ) {
    Scanner.sc = new Scanner(System.in);
    System.out.println("Enter the hyear to be checked");
    int year = sc.nextInt();
     if(year % 400 ==0)
    {
        System.out.println("Entered year is the leap year");
        
    }
     else{
        System.out.println("eNTERED YEAR IS NOT LEAP YEAR");
    }

    }
}