import java.util.ArrayList;
class Faculty{
    int facultyId;
    String facultyName;
Faculty(int id, String name) {
        facultyId = id;
        facultyName = name;
    }

    void displayfaculty(){
        System.out.println("faculty id:"+facultyId);
        System.out.println("faculty Name:"+facultyName);
    }

}
class CourseCatalog {
    String course1;
    String course2;

    CourseCatalog() {
        course1 = "Java Programming";
        course2 = "Data Structures";
    }
    void displayCourses() {
        System.out.println("Course 1: " + course1);
        System.out.println("Course 2: " + course2);
    }
}
class Department{
     int departmentId;
    String departmentName;
     ArrayList<Faculty> faculties;
     CourseCatalog courseCatalog;
    Department(int id,String name){
       departmentId = id;
       departmentName = name;
       faculties = new ArrayList<>();
       courseCatalog = new CourseCatalog();
    }
    void addfaculty(Faculty faculty){
        faculties.add(faculty);
}

void displaydepartment(){
    System.out.println("Department ID: " + departmentId);
    System.out.println("Department Name: " + departmentName);
    System.out.println("Faculty Members:");
    for (Faculty f : faculties) {
            f.displayfaculty();
        }
    System.out.println("Course Catalog:");
    courseCatalog.displayCourses();
}
}

class ScienceDepartment extends Department {

    ScienceDepartment(int id, String name) {
        super(id, name);
    }
}

class ArtsDepartment extends Department {

    ArtsDepartment(int id, String name) {
        super(id, name);
    }
}


public class universitydepartmentsystem {
     public static void main(String[] args){
        ScienceDepartment science =
        new ScienceDepartment(101, "Computer Science");
        Faculty f1 = new Faculty(1, "Rahul");
        Faculty f2 = new Faculty(2, "Priya");
        science.addfaculty(f1);
        science.addfaculty(f2);
        science.displaydepartment();
     }
}
