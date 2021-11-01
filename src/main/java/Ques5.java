import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the number to calculate factorial");
        System.out.println( firstFactorial(num));
    }
    public static int firstFactorial(int num){
        int fact=1;
        while(num!=1){
          fact=fact*num;
          num--;
        }
        return fact;
    }
}
