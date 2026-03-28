import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first num:");
        float a = sc.nextFloat();
        
        System.out.println("Enter second num:");
        float b = sc.nextFloat();
        
        float div = a/b;
        System.out.println("Result:"+div);
    }
}


// use either int or float
