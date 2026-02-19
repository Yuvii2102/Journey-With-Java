import java.util.Scanner;                                           
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


import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        
        int div = a/b;
        System.out.println("sum of two number is:"+div);
    }
}
