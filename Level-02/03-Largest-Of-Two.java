import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b)
         System.out.println("a is larger:" +a);
        else
         System.out.println("b is larger:" +b);
      
    }
}




import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        
        
        if(a>b)
        System.out.println("A is greater:"+a);
        else if(a<b)
        System.out.println("B is greater:"+b);
        
    }
}
