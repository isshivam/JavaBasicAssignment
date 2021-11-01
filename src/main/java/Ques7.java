import java.util.Scanner;
import java.io.*;
public class Ques7 {

    static int countinString(char ch, String s) {
        if (s.length() == 0)

            return 0;

        int count = 0;

        if (s.charAt(0) == ch)

            count++;

        count += countinString(ch, s.substring(1));
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str =sc.next();
        System.out.println("Enter the character of which you want to find the occurence");
        char ch = sc.next().charAt(0);
        System.out.println("Total occurence of "+ch+" is "+countinString(ch, str));
    }
}