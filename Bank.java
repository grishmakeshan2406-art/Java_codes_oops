class Customer{
    int customer_id;
    String customer_name;
    Bankaccount account;
    Customer(int id,String name){
    customer_id=id;
    customer_name=name;
    }
    void assignAccount(Bankaccount acc){
        account=acc;
    }

    void displaydetails(){
        System.out.println("Customer id:"+customer_id);
        System.out.println("Customer name:"+customer_name);
        System.out.println("account no:"+account.accountnumber);
        System.out.println("account type:"+account.accounttype);
        System.out.println("account balance:"+account.accountbalace);
    }
}
class Bankaccount{
    int accountnumber;
    String accounttype;
    int accountbalace;
   
   Bankaccount(int an,String at,int ab){
    accountnumber=an;
    accounttype=at;
    accountbalace=ab;
   }
}
 
public class Bank{
     public static void main(String[] args) {
        Customer c1=new Customer(121,"Grishma");
        Bankaccount b1=new Bankaccount(234561,"Current",26000);
        c1.assignAccount(b1);
        c1.displaydetails();
     }
}
