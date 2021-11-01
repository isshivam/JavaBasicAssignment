import java.util.*;
public class Ques4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string : ");
        String  s=sc.nextLine();
        System.out.println("Reverse String  is : "+reverse(s));
    }
    public static String reverse(String str)
    {
        String rev="";
        for(int i=str.length();i>0;--i)
        {
            rev=rev+(str.charAt(i-1));
        }
        return rev;
    }
}
