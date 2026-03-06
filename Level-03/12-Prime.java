import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}










import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int n=10;
        boolean prime = true;
        
        for(int i=2;i<n;i++)
        {
        if(n%i==0)
        {
        prime=false;
        break;
    }
}
System.out.println(prime);
}
}



import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int n=10;
        boolean prime = true;
        
        for(int i=2;i<n;i++)
        {
        if(n%i==0)
        {
        prime=false;
        break;
    }
}
if(prime && n>1)
 System.out.println("Prime");
else
 System.out.println("Not a Prime");
}
}
