package Ques19;

import java.util.Scanner;

public class IntegerToWord {
    private static final String EMPTY = "";
    private static final String[] word =
            { EMPTY, "One ", "Two ", "Three ", "Four ", "Five ", "Six ","Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ",
                    "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ","Seventeen ", "Eighteen ", "Nineteen " };
    private static final String[] tens =
            { EMPTY, EMPTY, "Twenty ", "Thirty ", "Forty ", "Fifty ",
                    "Sixty ", "Seventy ", "Eighty ", "Ninety " };
    private static String convertToDigit(int number, String suffix)
    {
        if (number == 0) {
            return EMPTY;
        }
        if (number > 19) {
            return tens[number / 10] + word[number % 10] + suffix;
        }
        else {
            return word[number] + suffix;
        }
    }
    public static String convert(int number)
    {
        StringBuilder res = new StringBuilder();
        res.append(convertToDigit((number / 1000000000) % 100, "Billion, "));
        res.append(convertToDigit((number / 10000000) % 100, "Crore, "));
        res.append(convertToDigit(((number / 100000) % 100), "Lakh, "));
        res.append(convertToDigit(((number / 1000) % 100), "Thousand "));
        res.append(convertToDigit(((number / 100) % 10), "Hundred "));

        if ((number > 100) && (number % 100 != 0)) {
            res.append("and ");
        }
        res.append(convertToDigit((number % 100), ""));

        return res.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        System.out.println(convert(num));
    }
}


