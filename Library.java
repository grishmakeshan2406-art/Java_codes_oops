import java.util.Scanner;

class Book{
    int Book_id;
    String Book_name;
   Book(int id,String name){
    Book_id=id;
    Book_name=name;
   }
}

class student{
    String student_name;
    int enrolmentno;
    Book borrowedbook;
    student(String name,int en){
        student_name=name;
        enrolmentno=en;
    }

    void borrowbook(Book book){
        borrowedbook=book;
    }

    void displaydetails(){
        System.out.println("student name:"+student_name);
        System.out.println("enrolment no:"+enrolmentno);
        System.out.println("book id:"+borrowedbook.Book_id);
        System.out.println("borrowed book:"+borrowedbook.Book_name);
    }

}

public class Library {
    public static void main(String[] args){
        Book b1=new Book(23452,"JAVA Programming"); //ASSOCIATION
        student s1=new student("Grishma",139);
        s1.borrowbook(b1);
        s1.displaydetails();
    }
}
