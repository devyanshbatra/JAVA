public class reversedigits {
    public static void main(Strings args[]){
        scanner.sc = new scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int r;
        while(num!=0)
        {
        r = num%10;
        int reverse = reverse*10+r;
        num = num%10;
        }
        System.out.println("The reverse of the digits is "+reverse)
        
    }
    
}
