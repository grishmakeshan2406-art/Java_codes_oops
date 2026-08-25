import java.util.Scanner;
class Employeee{
    int id;
    String name;
    int basicsalary;
    String designation;
    static int totalemployees=0;

    Employeee(int ID,String NAME,int bs,String design){
        id=ID;
        name=NAME;
        basicsalary=bs;
        designation=design;
        totalemployees++;
    }
    double calculateHRA(){
        return basicsalary*0.2;
    }
     double calculateDA(){
        return basicsalary*0.15;
    }
    double transportallowance(){
        return 1500;
    }

    double calculatebonus(){
        if(designation.equals("Manager")){
            return basicsalary*0.10;
        }
        else{
            return basicsalary*0.05;
        }
    }

    double calculateGrosssalary(){
        return basicsalary+calculateHRA()+calculateDA()+transportallowance()+calculatebonus();
    }

    void displaypayroll(){
        System.out.println("--------------------");
        System.out.println("Employee id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Basic salary:"+basicsalary);
        System.out.println("Designation:"+designation);
        System.out.println("HRA(20%):"+calculateHRA());
        System.out.println("DA(15%):"+calculateDA());
        System.out.println("Transport: " +transportallowance());
        System.out.println("Performance Bonus: " +calculatebonus());
        System.out.println("Gross Salary: " +calculateGrosssalary());
        System.out.println("--------------------");
    }

    static void displayallpayroll(Employeee[] employees){
        System.out.println("=====Company Payroll====");
        for(Employeee emp:employees){
            emp.displaypayroll();
        }
        System.out.println("Total Employees are:"+totalemployees);
    }
}
public class PayrollSystem{
public static void main(String[] args){
    Employeee[] employees=new Employeee[4];
    employees[0]=new Employeee(101, "Grishma Keshan", 25000,"Manager");
    employees[1]=new Employeee(102,"Nimisha Keshan",22000,"Developer");
    employees[2]=new Employeee(103,"Neelam Keshan",20000,"Accountant");
    employees[3]=new Employeee(104,"Rakesh Keshan",220000,"Hr");
    Employeee.displayallpayroll(employees);
}
}
