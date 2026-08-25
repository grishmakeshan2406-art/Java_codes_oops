import java.util.ArrayList;
class student{
    int rollno;
    String name;
    student(int rn,String n){
        rollno=rn;
        name=n;
    }
}
class college{
    String collegename;
    ArrayList<student> students;
    college(String cn){
        collegename=cn;
         students = new ArrayList<>();
    }

    void addstudent(student s){
     students.add(s);
    }

    void displaystudentsdetails(){
        System.out.println("College name:"+collegename);
        for(student s: students){
        System.out.println("Student name:"+s.name);
        System.out.println("Student enrolnment no:"+s.rollno);
        }
    }
}
public class university {
     public static void main(String[] args) {
            student s1= new student(139,"Grishma");
            student s2= new student(140,"Nimisha");
            college c1=new college("Jaypee institute of information technology");
            c1.addstudent(s1);
            c1.addstudent(s2);
            c1.displaystudentsdetails();
         }
}




 