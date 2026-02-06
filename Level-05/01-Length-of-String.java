public class StringLength                                     // using built-in method
{
  public static void main(String args[])
  {
    String str = "Hello";
    
    int len = str.length();
    
    System.out.println("Length:"+len);
  }
}



public class StringLength                                     // without using length()
{
  public static void main(String args[])
  {
    String str = "Hello";
    
    int count = 0;
    
    for(char c : str.toCharArray())
    {
    count++;
    }
    
    System.out.println("Length:"+count);
  }
}
