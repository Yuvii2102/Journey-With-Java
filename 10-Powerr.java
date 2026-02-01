import java.util.Scanner;                                                   Math.pow(base,exponent)
public class Main                                                           Math.pow(2,3) = 2*2*2 = 8 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Base:");
        int base = sc.nextInt();
        
        System.out.println("Enter Exponent:");
        int exponent = sc.nextInt();
        
        double result = Math.pow(base,exponent);
        System.out.println("Result:"+result);
    }
}
