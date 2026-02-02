import java.util.Scanner;                                                    // Square = num * num
public class Main                                                            // Cube = num * num * num
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Eneter a number:");
      int num = sc.nextInt();
      
      int square = num * num;
      int cube = num * num * num;

      System.out.println("Square:" +square);
      System.out.println("Cube:" +cube);  
    }
  }
