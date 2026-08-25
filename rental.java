import java.util.Scanner;
class Vehicle {
String vehicle_no;
int rental_days;

void get_details_car(){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter vehicle no of car:");
      vehicle_no=sc.nextLine();
      System.out.println("enter rental days of car:");
      rental_days=sc.nextInt();
}
void get_details_bike(){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter vehicle no of bike:");
      vehicle_no=sc.nextLine();
      System.out.println("enter rental days of bike:");
      rental_days=sc.nextInt();
}
}

class Car extends Vehicle{
int rental_amount=60;
 
void display_car(){
    int total_rental_amount=rental_amount*rental_days; 
    System.out.println("----Car Details:----");
    System.out.println("Vehicle no of car:"+vehicle_no);
    System.out.println("no of rental days of car:"+rental_days);
    System.out.println("rental amount of car:"+total_rental_amount);
}
}

class Bike extends Vehicle{
   int rental_amount_BIKE=25;
  
void display_bike(){
      int total=rental_amount_BIKE*rental_days;
      System.out.println("----Bike Details:----");
    System.out.println("Vehicle no of bike:"+vehicle_no);
    System.out.println("no of rental days of bike:"+rental_days);
    System.out.println("rental amount of bike:"+total);
}
}

public class rental {
    public static void main(String[] args){

    Bike b=new Bike();
    Car c=new Car();
    b.get_details_bike();
    c.get_details_car();
    b.display_bike();
    c.display_car();
    }
}
