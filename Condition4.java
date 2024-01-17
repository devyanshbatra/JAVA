import java.util.*;
public class Condition4{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of a is");
       
        int a = sc.nextInt();
        System.out.println("Value of b is");
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Equal");
        }   else if (a > b){
                    System.out.println("A is greater than B");

            }
                else{
                    System.out.println("B is greater");
                }
            
        
    }
}
