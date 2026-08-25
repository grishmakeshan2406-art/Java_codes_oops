import java.util.ArrayList;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {

    int studentId;

    Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

class Teacher extends Person{
 int teacherId;
 ArrayList<Student> students;
 Teacher(int teacherId, String name, int age) {
        super(name, age);
        this.teacherId = teacherId;
        students = new ArrayList<>();
    }
 void addStudent(Student student) {
        students.add(student);
    }
void displayTeacher() {

        System.out.println("\nTeacher ID: " + teacherId);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Age: " + age);

        System.out.println("Associated Students:");

        for (Student s : students) {
            s.displayStudent();
        }
}
}

class school{
    String schoolName;
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
  school(String sn) {

        this.schoolName = sn;

        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }
void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    void addStudent(Student student) {
        students.add(student);
    }
     void displaySchool() {

        System.out.println("================================");
        System.out.println("School Name: " + schoolName);
        System.out.println("================================");

        System.out.println("\nTeachers and Associated Students:");

        for (Teacher t : teachers) {
            t.displayTeacher();
        }

        System.out.println("\nAll Students in School:");

        for (Student s : students) {
            s.displayStudent();
        }
    }
}

public class SchoolManagementSystem {
public static void main(String[] args) {
Student s1 = new Student(101, "Rahul", 18);
Student s2 = new Student(102, "Priya", 19);
Student s3 = new Student(103, "Amit", 18);

Teacher t1 = new Teacher(1, "Mr. Sharma", 40);
Teacher t2 = new Teacher(2, "Mrs. Gupta", 35);

t1.addStudent(s1);
t1.addStudent(s2);
t2.addStudent(s3);
school school = new school("ABC Public School");
school.addTeacher(t1);
school.addTeacher(t2);
school.addStudent(s1);
school.addStudent(s2);
school.addStudent(s3);
school.displaySchool();
    }
}





