import java.util.Scanner;
class product{
    int product_id;
    String product_name;
    int quantity;
    int price_per_unit;

    void get_details(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter product id:");
     product_id=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter product name:");
     product_name=sc.nextLine();
     System.out.println("enter quantity:");
     quantity=sc.nextInt();
     System.out.println("enter price:");
     price_per_unit=sc.nextInt();

    }
}
class discountproduct extends product{
void calculateanddisplay(){
    int discount_percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter discounted percentage:");
    discount_percentage=sc.nextInt();
    int total_purchase_amount=quantity*price_per_unit;
    int discount_amt=total_purchase_amount*(discount_percentage)/100;
    int final_payable_amt=total_purchase_amount-discount_amt;
    System.out.println("------Product details------");
    System.out.println("Product id is:"+product_id);
    System.out.println("Product name is:"+product_name);
    System.out.println("Product quantity:"+quantity);
    System.out.println("Price per unit is:"+price_per_unit);
    System.out.println("Total purchase amount:"+total_purchase_amount);
    System.out.println("Discount amount:"+discount_amt);
    System.out.println("Final payable amount:"+final_payable_amt);
}
}

public class shopping {
    public static void main(String[] args){
    discountproduct dp=new discountproduct();
    dp.get_details();
    dp.calculateanddisplay();
    }
}
