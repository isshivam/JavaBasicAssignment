
public class Ques14 {

    public static void main(String args[]) {
        try
        {
            Class.forName("Shivam");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}