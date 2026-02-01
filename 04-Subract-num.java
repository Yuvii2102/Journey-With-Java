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
        
        int diff = a-b;
        System.out.println("Difference of two numbers is:" +diff);
    }
}
