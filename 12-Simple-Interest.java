import java.util.Scanner;                                                     // If you need decimals use float or double instead of int
mport java.util.Scanner;
public class Main
{
  public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Principal, Rate and Time:");
    
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();
    
    int si = (p * r * t) / 100;
    System.out.println("Simple Interest :" +si);
    
    }
}
