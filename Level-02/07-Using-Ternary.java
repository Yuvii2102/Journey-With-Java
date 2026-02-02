import java.util.Scanner;                                                   // ternary operator
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
    
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
       int largest = (a>b)?((a>c)?a:c) : ((b>c)?b:c);
       System.out.println("Largest number :"+largest);                      // use the same for smallest also
    }
}
