import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter first num:");
        int a = sc.nextInt();
        
        System.out.println("Enter second num:");
        int b = sc.nextInt();
        
        int product = a*b;
        System.out.println("Product of two numbers is:" +product);
    }
}
