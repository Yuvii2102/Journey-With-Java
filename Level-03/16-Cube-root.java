import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n =  sc.nextInt();
       
       double root = Math.cbrt(n);
       
       System.out.println("Cube root : "+root);
    }
}
