import java.util.Scanner;
public class employee {
    double employee_id;
    String employee_name;
    double basic_salary;
    char grade;

    employee(double id,String name,double salary,char g){
        employee_id=id;
        employee_name=name;
        basic_salary=salary;
        grade=g;
    }

    void calculatesalary(){
        double annual_salary=basic_salary*12;
        double bonusrate=0;
        double taxrate=0;

        if(grade=='A'){
            bonusrate=0.15;
        }
        else if(grade=='B'){
            bonusrate=0.1;
        }
        else if(grade=='C'){
            bonusrate=0.05;
        }
        double bonus=annual_salary * bonusrate;

        if(annual_salary<300000){
            taxrate=0;
        }
        else if(annual_salary>=300000 && annual_salary<=699999){
            taxrate=0.1;
        }
        else if(annual_salary>=700000 && annual_salary<=999999){
            taxrate=0.2;
        }
        else if(annual_salary>=1000000){
            taxrate=0.3;
        }

        double taxamount=annual_salary * taxrate;
        double netsalary=annual_salary+bonus-taxamount;
        System.out.println("employee details:");
        System.out.println("Employee id:"+employee_id);
        System.out.println("Employee name:"+employee_name);
        System.out.println("Basic Salary:"+basic_salary);
        System.out.println("annual salary:"+annual_salary);
        System.out.println("tax amount:"+taxamount);
        System.out.println("bonus amount:"+bonus);
        System.out.println("net salary:" + netsalary);

    }
    public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 System.out.println("enter employee id:");
 int id = scanner.nextInt();
 scanner.nextLine();
System.out.println("enter employee name:");
String name=scanner.nextLine();
System.out.println("enter basic salary:");
double salary=scanner.nextDouble();
System.out.println("enter performance grade:");
char grade=scanner.next().charAt(0);
employee e=new employee(id, name, salary, grade);
e.calculatesalary();
scanner.close();
}
}
