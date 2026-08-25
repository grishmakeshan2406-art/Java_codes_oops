import java.util.Scanner;
public class markscalculator {
    int Rollno;
    String Name;
    int[] marks=new int[5];
    static int studentCount = 0;

      markscalculator(int rollNumber, String name) {
        Rollno = rollNumber;
        Name = name;
        studentCount++;
    }
    int calculatetotal(){
        int total=0;
        for(int i=0;i<5;i++){
            total=total+marks[i];
        }
        return total;
    }

    double calculateAverage() {
        int total = calculatetotal();
        return total / 5.0;
    }
    char calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return 'A';
        }
        else if (average >= 75) {
            return 'B';
        }
        else if (average >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

     void display() {

        System.out.println("\n------------------------");

        System.out.println("Roll Number: " + Rollno);
        System.out.println("Name: " + Name);
        System.out.println("Subject Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total: " + calculatetotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }

   public static void main(String[] args){
 markscalculator[] students =  new markscalculator[2];
 students[0] =new markscalculator(101, "Rahul");
 students[1] =new markscalculator(102, "Raj");
  students[0].marks =new int[]{90, 85, 95, 88, 92};
 students[1].marks = new int[]{70, 80, 75, 78, 72};

 for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
System.out.println("\nTotal Students Processed:"+studentCount);
    }

   }



