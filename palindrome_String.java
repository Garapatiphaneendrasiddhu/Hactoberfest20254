import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String s = "abba";
        
        String p = "";
        
        for(int i = s.length()-1; i >=0; i--)
        {
            p += s.charAt(i);
        }
        
        if(s.equals(p))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
