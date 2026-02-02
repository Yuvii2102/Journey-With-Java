import java.util.Scanner;                                                   // if-else                                                 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
    
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b)
         System.out.println("a is larger:"+a);
        else if( b>a)
         System.out.println("b is larger:"+b);
        else
         System.out.println("c is larger:"+c);
    }
}



// Another method used :- 

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
        
        if (a>=b && a>=c)
         System.out.println("a is larger:"+a);
        else if (b>=a && b>=c)
         System.out.println("b is larger:"+b);
        else
         System.out.println("c is larger:"+c);
    }
}


                     
