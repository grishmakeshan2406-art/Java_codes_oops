import java.util.Scanner;
class consumer {
    int customer_id;
    String consumer_name;
    int electricity_units;
  
    consumer(int id,String name,int units){
    customer_id=id;
    consumer_name=name;
    electricity_units=units;
   
    }
}
class domestic extends consumer{
   double bill_amount;
   double surcharge;
   double final_amount;
   domestic(int id,String name,int units){
    super(id, name,units);
   }
    void domesticcost(){

            if(electricity_units<=100){
                bill_amount=electricity_units*4;
            }
            else if(electricity_units<=300){
                bill_amount=100*4+(electricity_units-100)*6;
            }
            else{
            bill_amount=100*4+200*6+(electricity_units-300)*8;
            }
        
        if(bill_amount>5000){
            surcharge=bill_amount*5.0/100;
        }
        else{
            surcharge=0;
        }
        final_amount=bill_amount+surcharge;
    }

    

    void display1(){
        System.out.println("-------Domestic Details-------");
        System.out.println("Customer id is:"+customer_id);
        System.out.println("Customer name is:"+consumer_name);
        System.out.println("No of electricity units is:"+electricity_units);
        System.out.println("Bill amount is:"+bill_amount);
        System.out.println("Surcharge:"+surcharge);
        System.out.println("Total payable amount is:"+final_amount);
    }
}
    

    
class commercial extends consumer{
    double bill_amount;
    double surcharge;
    double final_amount;
    commercial(int id,String name,int units){
    super(id, name,units);
   }
    void commercialcost(){
         
             if(electricity_units<=100){
                bill_amount=electricity_units*6;
            }
            else if(electricity_units<=300){
                bill_amount=100*6+(electricity_units-100)*8;
            }
            else{
            bill_amount=100*6+200*8+(electricity_units-300)*10;
            }
       
    if(bill_amount>5000){
    surcharge=bill_amount*(5.0/100);
    }
    else{
        surcharge=0;
    }
    final_amount=bill_amount+surcharge;}
    
void display2(){
    System.out.println("------- CAommercial Details-------");
        System.out.println("Customer id is:"+customer_id);
        System.out.println("Customer name is:"+consumer_name);
        System.out.println("No of electricity units is:"+electricity_units);
        System.out.println("Bill amount is:"+bill_amount);
        System.out.println("Surcharge:"+surcharge);
        System.out.println("Total payable amount is:"+final_amount);
}
} 

public class electricity{
    public static void main(String[] args){
       domestic dom = new domestic(243, "Grishma", 875);
       commercial com = new commercial(112, "Nimisha", 750);
       dom.domesticcost();
       dom.display1();
       com.commercialcost();
       com.display2();
    }
}



