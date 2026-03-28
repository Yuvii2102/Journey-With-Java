public class ReverseString 
{
    public static void main(String[] args) 
    {
        String str = "yuvi";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) 
        {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}

// OR

public class ReverseString
{
    public static void main(String[] args) 
  {
        
        String str = "Automation" ;
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
    
    }
}
