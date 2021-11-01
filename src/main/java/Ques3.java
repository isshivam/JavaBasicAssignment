import java.util.*;
public class Ques3
{
    public static String removeAllSpecifiedCharacter(String str,char ch)
    {
        String finalStr = "";
        int len = str.length();
        for (int i = 0; i < len; i++)
        {
            char temp = str.charAt(i);
            if (!(i >= 0 && i < len  && temp == ch))
                finalStr = finalStr + temp;
        }
        return finalStr;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Enter the character you want to remove");
        char ch = sc.next().charAt(0);
        System.out.println("The new string is: "+removeAllSpecifiedCharacter(str,ch));
    }
}
