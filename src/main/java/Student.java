public class Student implements Cloneable{
    int roll_no;
    String name;

    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
    //    Creating copy constructor
    Student(Student objectCloning){
        this.roll_no = objectCloning.roll_no;
        this.name = objectCloning.name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Student obj1 =new Student(300,"SHIVAM");
        System.out.println("***********By using clone method*************");
        Student obj2 = (Student) obj1.clone();
        System.out.println("roll-no.: "+obj1.roll_no +"\nName: "+obj1.name);
        System.out.println("roll-no.: "+obj2.roll_no +"\nName: "+obj2.name);

        System.out.println("***********By using copy constructor*************");
        Student copyObj = new Student(obj1);
        System.out.println("roll-no.: "+copyObj.roll_no +"\nName: "+copyObj.name);
    }
}
