//by using while loop
import java.util.*;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        usingWhileLoop(word);
        //usingDoWhileLoop(word);//we can use any of them while or do while
    }
   public static void usingWhileLoop(String word){
       Scanner sc = new Scanner(System.in);
       while(!word.equals("done"))
       {
           if(word.charAt(0) == word.charAt(word.length() - 1))
           {
               System.out.println("First and last character are equals in : " + word);
           }
           else
           {
               System.out.println("First and last character are NOT equals in : " + word);
           }
           word = sc.next();
       }
   }
   public static void usingDoWhileLoop(String word){
       Scanner sc = new Scanner(System.in);
       do
       {
           if(word.charAt(0) == word.charAt(word.length() - 1))
           {
               System.out.println("First and last character are equals for the word: " + word);
           }
           else
           {
               System.out.println("First and last character are NOT equals for the word: " + word);
           }
           word = sc.next();
       }while(!word.equals("done"));
   }

}
