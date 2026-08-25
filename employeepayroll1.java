import java.util.Scanner;
class Employee1{
    int id;
    String name;
    int basicsalary;
    String designation;

static int totalemployees=0;
    Employee1(int ID,String NAME, int bs, String design){
        id = ID;
        name = NAME;
        basicsalary = bs;
        designation = design;
        totalemployees++;
    }

    double calculateHRA() {
        return basicsalary * 0.20;
    }

    double calculateDA() {
        return basicsalary * 0.15;
    }

    double transportallowance() {
        return 1500;
    }

    double calculatebonus() {
        if (designation.equalsIgnoreCase("Manager")) {
            return basicsalary * 0.10;
        } 
        else {
            return basicsalary * 0.05;
        }}


    double calculateGrosssalary() {
        return basicsalary + calculateHRA() + calculateDA()
                + transportallowance() + calculatebonus();
    }

    void displaypayroll() {
        System.out.println("================");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("Designation: " + designation);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Transport: " + transportallowance());
        System.out.println("Performance Bonus: " + calculatebonus());
        System.out.println("Gross Salary: " + calculateGrosssalary());
        System.out.println("================");
    }
     static void displayallpayroll(Employee1[] employees) {
        System.out.println("\n===== COMPANY PAYROLL =====");

        for (Employee1 emp : employees) {
            emp.displaypayroll();
        }

        System.out.println("\nTotal Employees: " + totalemployees);
    }
}

public class employeepayroll1 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter no of employees:");
  int n=sc.nextInt();
  Employee1[] employees=new Employee1[n];
  for(int i=0;i<n;i++){
    System.out.println("\nEnter details of Employee " + (i + 1));
    System.out.print("Enter ID: ");
     int id = sc.nextInt();
     sc.nextLine(); 
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Basic Salary: ");
    int salary = sc.nextInt();
    sc.nextLine(); 
    System.out.print("Enter Designation: ");
    String designation = sc.nextLine();
    employees[i]=new Employee1(id, name, salary, designation);
  }
  Employee1.displayallpayroll(employees);
  sc.close();
  }  
}
