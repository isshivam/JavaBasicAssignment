class Test
    {
        void hello()
        {
            System.out.println("hello Shivam!");
        }
    }
     class Ques14b {
        public static void main(String args[])
        {
            Test geeks = new Test();//if we will remove class Test we will get NoClassDefFoundError
            geeks.hello();
        }
    }
