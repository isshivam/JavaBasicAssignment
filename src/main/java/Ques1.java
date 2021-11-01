import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.*;
public class Ques1
{
    public static boolean popPatternInString(String str)
    {
        int len = str.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (str.charAt(i) == 'p' && str.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check pattern pop exist or not?");
        String str = sc.next();
        System.out.println("given String is: "+str);
        System.out.println("p?p pattern  exist in the given string? "+ popPatternInString(str));
    }
}
