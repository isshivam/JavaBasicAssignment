import java.io.Serializable;
    public class Ques13_LibraryManagement
    {
        public static class Book implements Serializable
        {
            public int Book_No;
            protected String title;
            private final String author;
            protected double price;
            public Book() {
                Book_No = 0;
                title = null;
                author = null;
                price = 0;
            }
            public Book(int b_No, String title, String author, double price) {
                this.Book_No = b_No;
                this.title = title;
                this.author = author;
                this.price = price;
            }
            public String toString()
            {
                return "\n TITTLE:" + title + "\n AUTHOR :" + author +
                        "\n B_NUMBER" + Book_No + "\n PRICE" + price + "\n";
            }
        }
        interface lib_Staff
        {
            public void test();
        }
        static class library implements lib_Staff {
            public void test() {
                System.out.println("Interface Method Implemented");
            }
            public static void main(String[] args) {
                library p = new library();
                p.test();
            }
        }
        abstract static class price
        {
            int mrp = 0;
            abstract public void calculateprice();
        }
        public static class account extends price
        {
            public static void main(String[] args)
            {
                account obj = new account();
                obj.mrp= 300;
                obj.calculateprice();
            }
            public void calculateprice() {
                System.out.println("Maximum Retal Price of book= " +mrp);
            }
        }
    }

