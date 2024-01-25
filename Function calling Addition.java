public class Main {
    //A METHOD to calculate sum of 2 numbers - a & b
    public static int calculatedsum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a =sc.nextInt();
       int b = sc.nextInt();
       int sum = calculatedsum(a,b);
       system.out.println("The sum of the nubers entered is "+sum);
       


        
 
    }
 