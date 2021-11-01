package Ques22;
import java.util.Scanner;

public class CheckDigit {
    public static int sumDoubleeven(long checkNum) {
        int sum = 0;
        String num = checkNum + "";
        for (int i = num.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    public static int getDigit(int checkNum) {
        if (checkNum < 9)
            return checkNum;
        return checkNum / 10 + checkNum % 10;
    }

    public static int sumodd(long checkNum) {
        int sum = 0;
        String num = checkNum + "";
        for (int i = num.length() - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digits");
        String in = scanner.next();
        long num = Long.parseLong(in);
        System.out.println(sumDoubleeven(num) + sumodd(num));
        if((sumDoubleeven(num) + sumodd(num)) % 10==0){
            System.out.println("Okay");
        }else {
            System.out.println("Not Okay");
        }
        System.out.println();

    }

}
