import java.util.Scanner;                                           // using integer
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int divint = a/b;
        
        System.out.println("Integer divison="+divint);
    }
}


import java.util.Scanner;                                        // using float
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        float divfloat = a/b;
        
        System.out.println("Float divison="+divfloat);
    }
}
