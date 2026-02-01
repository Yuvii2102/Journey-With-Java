import java.util.Scanner;                                                             // sc.next() - takes input as string
public class Main                                                                     // .char() - takes first character
{
  public static void main(String args[])                                              // int ascii = ch;  
    {                                                                                     converts character to ASCII number
    Scanner sc = new Scanner(System.in);
                                                                                      Enter a character: A -> 65
    System.out.println("Enter a character:");                                         Enter a character: a -> 97
    char ch = sc.next().charAt(0);
    int ascii = (int)ch;
    System.out.println("ASCII value of char:"+ascii);

  }
}
