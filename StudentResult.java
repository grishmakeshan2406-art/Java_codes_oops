import java.util.Scanner;
class Student{
int roll_no;
String name;

void getstudentdata(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roll no:");
    roll_no=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Student Name:");
    name=sc.nextLine();
}
}

class Marks extends Student{
    int marks1,marks2,marks3;
    void getmarks(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Marks in Subject 1:");
    marks1=sc.nextInt();
    System.out.println("Enter Marks in Subject 2:");
    marks2=sc.nextInt();
    System.out.println("Enter Marks in Subject 3:");
    marks3=sc.nextInt();
    }
}

class Result extends Marks{
int total;
int percentage;
String grade;
void calculateResult(){
    total=marks1+marks2+marks3;
    percentage=total/3;
    if(percentage>=90){
        grade="A+";
    }

    else if(percentage>=80){
        grade="A";
    }

    else if(percentage>=70){
        grade="B";
    }

    else if(percentage>=60){
        grade="C";
    }
    
    else if(percentage>=50){
        grade="D";
    }

    else{
        grade="Fail";
    }  
}

void displayresult(){
System.out.println("------Student Data------");
System.out.println("Roll number:"+roll_no);
System.out.println("Name:"+name);
System.out.println("Marks in subject 1:"+marks1);
System.out.println("Marks in subject 2:"+marks2);
System.out.println("Marks in subject 3:"+marks3);
System.out.println("Total Marks:"+total);
System.out.println("Percentage:"+percentage);
System.out.println("Grade:"+grade);

}
}

public class StudentResult{
    public static void main(String[] args){
    Result r=new Result();
    r.getstudentdata();
    r.getmarks();
    r.calculateResult();
    r.displayresult();
    }
}