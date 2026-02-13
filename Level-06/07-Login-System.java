import java.util.Scanner;

public class SimpleLogin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String correctUsername = "Yuvi";
        String correctPassword = "1234";
        
        System.out.println("Enter username:");
        String username = sc.nextLine();
        
        System.out.println("Enter password:");
        String password = sc.nextLine();
        
        if(username.equals(correctUsername)&&password.equals(correctPassword))
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
}
