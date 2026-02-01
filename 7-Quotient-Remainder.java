import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Dividend:");
        int a = sc.nextInt();
        
        System.out.println("Enter Divisor:");
        int b = sc.nextInt();
        
        int quotient = a/b;
        int remainder= a%b;
        
        System.out.println("Quotient= "+quotient);
        System.out.println("Remainder= "+remainder);
    }
}
