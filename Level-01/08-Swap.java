//With Temp

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int temp = a;
        a=b;
        b=temp;
        
        System.out.println("After swapping:");
        System.out.println(a);
        System.out.println(b);
    }
}


//Without Temp

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After swapping:");
        System.out.println(a);
        System.out.println(b);
       
    }
}


// Swap using third variable by user input

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = 10;
        int b = 20;
        
        int temp = a;
        a=b;
        b=temp;
        
         System.out.println(a);
         System.out.println(b);
       
    }
}


// Swap without using third variable

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = 10;
        int b = 20;
       
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println(a);
        System.out.println(b);
       
    }
}


