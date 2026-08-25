import java.util.Scanner;
public class calculator {
    int no1;
    int no2;
    calculator(int n1,int n2){
no1=n1;
no2=n2;
    }
    int add_no(){
        return no1+no2;
    }
    void display(){
        System.out.println("addition is:"+add_no());
    }
    public static void main(String[] args){
        calculator cal=new calculator(22, 24);
        cal.add_no();
        cal.display();
    }
}
