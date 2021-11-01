public class SingletonClass {
    private static SingletonClass instance = null;
    private String text;

    private SingletonClass() {
        text = "Singleton class constructor";
    }

    private static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        Message.print(instance1.text);
        Message.print(instance1 == instance2); // Output : true , Because both the instances refer to
        // same memory location on the heap.
    }
}
class Message {
    public static void print(Object message)
    {
        System.out.println(message);
    }
}