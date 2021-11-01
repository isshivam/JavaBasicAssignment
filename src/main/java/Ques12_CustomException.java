 class InvalidAgeException  extends Exception
    {
        public InvalidAgeException (String str)
        {
            super(str);
        }
    }
    public class Ques12_CustomException
    {
        static void validate (int age) throws InvalidAgeException{
            if(age < 18){
                throw new InvalidAgeException("age is not valid to vote");
            }
            else {
                System.out.println("Congratulation You can vote now :)");
            }
        }
        public static void main(String args[])
        {
            try
            {
                validate(17);
            }
            catch (InvalidAgeException ex)
            {
                System.out.println("Caught the exception Exception occured: " + ex);
            }
        }
    }
