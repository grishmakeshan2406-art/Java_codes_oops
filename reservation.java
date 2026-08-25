import java.util.Scanner;
public class reservation {
    String customer_name;
    int no_of_guests;
    int cost_per_person;
    String reservation_type;
    double total_amt;

    reservation(String name,int guests,int cost,String type){
       customer_name = name;
       no_of_guests = guests;
       cost_per_person = cost;
       reservation_type = type;
    }

    void total_bill(){
        total_amt=no_of_guests*cost_per_person;
        if(no_of_guests>10){
            double discount=total_amt*(12.0/100);
            total_amt=total_amt-discount;
            System.out.println("Total amount after discount is:"+total_amt);
        }
        if(reservation_type.equals("OUTDOOR")){
            total_amt=total_amt+500;
            System.out.println("Total amount with outdoor reservation is:"+total_amt);
        }
    }

    void displaydetails(){
    System.out.println("Customer name is:"+customer_name);
    System.out.println("No of guests are:"+no_of_guests);
    System.out.println("Cost per person is:"+cost_per_person);
    System.out.println("Reservation type is:"+reservation_type);
    System.out.println("Total payable amount is:"+total_amt);
    }

     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Customer Name:");
    String name=sc.nextLine();
    System.out.println("Enter No of Guests:");
    int guests=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter cost per person:");
    int cost=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter reservation type(INDOOR/OUTDOOR):");
    String type=sc.nextLine();
    
    reservation resv=new reservation(name, guests, cost, type);
    resv.total_bill();
    resv.displaydetails();
     }
}
