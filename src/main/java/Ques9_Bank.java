public class Ques9_Bank {
        public static void main(String[] args) {
            Sbi SBI =new Sbi();
            Boi BOI=new Boi();
            Icici ICICI =new Icici();
            getDetails();
            SBI.getDetails();
            BOI.getDetails();
            Icici.getDetails();


        }
        public static void getDetails(){
            int totalNoOfBank= 3;
            System.out.println("total no of Banks are 3");
        }
    }
    class Sbi extends Ques9_Bank{
        public static void getDetails(){
            int totalBranchs=7000;
            float rateOfInterest=6.2f;
            System.out.println("Total Branchs of SBI: "+totalBranchs+"\nrate Of Interest in SBI: "+rateOfInterest+"%");
        }
    }
    class Boi extends Ques9_Bank{
        public static void getDetails(){
            int totalBranchs=5000;
            float rateOfInterest=6.7f;
            System.out.println("Total Branchs of BOI : "+totalBranchs+"\nrate Of Interest in BOI: "+rateOfInterest+"%");
        }
    }
    class Icici extends Ques9_Bank{
        public static void getDetails(){
            int totalBranchs=5000;
            float rateOfInterest=6.5f;
            System.out.println("Total Branchs of ICICI: "+totalBranchs+"\nrate Of Interest in ICICI: "+rateOfInterest+"%");
        }
    }

