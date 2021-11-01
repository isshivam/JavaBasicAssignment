public class Ques17
{
        public static void main(String[] args) throws Exception
        {
            try
            {
                System.out.println("You are in try block");

                throw new NullPointerException("NullPointerException occured");
            }
            catch (NullPointerException e)
            {
                System.out.println("catch block 1");

                throw new NumberFormatException("Number Format Exception occurred");
            }
            catch (Exception e)
            {
                System.out.println("catch block 2");
            }
            finally
            {
                System.out.println("finally block");
            }
        }
    }
