public class Ques8 {
    static int age =22;
    static String firstname;
    static{
        firstname="SHIVAM";
    }
    public static String lastName(){
        return "RAI";
    }


    public static void main(String[] args) {
        System.out.println("firstname: "+firstname+" lastname: "+lastName()+" age: "+age);
    }
}
