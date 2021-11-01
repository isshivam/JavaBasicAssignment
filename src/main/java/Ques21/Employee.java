package Ques21;
import java.util.Scanner;

//Creating an employee class
public class Employee {
    private int empId;
    private String empName, empDesignation;
    Employee(int empId, String empName, String empDestination){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDestination;
    }
    void setEmpId(int empId){
        this.empId =empId;
    }
    void setEmpName(String name){
        this.empName =empName;
    }
    void setEmpDesignation (String empDesignation){
        this.empDesignation =empDesignation;
    }
    int getEmpId(){
        return this.empId;
    }
    String getEmpName(){
        return this.empName;
    }
    String getEmpDesignation(){
        return this.empDesignation;
    }
}


class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees");
        int num = sc.nextInt();
//        creating array of employees
        Employee[] employee=new Employee[num];
        for (int i=0; i<num; i++){
            System.out.println("Enter Employee id");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name");
            String name = sc.next();
            System.out.println("Enter Employee Designation");
            String designation = sc.next();
            employee[i] = new Employee(id,name,designation);
        }
//        printing all the details of employees
        for (Employee emp:employee) {
            System.out.println("Employee ID: "+emp.getEmpId()+"\nEmployee Name: "+emp.getEmpName()+"\nDesignation: "+emp.getEmpDesignation());
        }

    }
}
