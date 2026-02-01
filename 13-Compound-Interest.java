import java.util.Scanner;                                                              Output : 5000
public class Main                                                                               5
{                                                                                               3
  public static void main(String args[])                                                        // answer :- 10000              
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Principal, Rate and Time:");
    
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();
    
    int ci = p * (1+r/100) * t - p;
    System.out.println("Compound Interest :" +ci);
    
    }
}
