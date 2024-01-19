import java.util.*;
public class EVEN NUMBER TILL N{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(i=0;i<n;i++) {
         if(i % 2 ==0){
            System.out.println(i);
         }
        }

    }
}