import java.util.Scanner;
 class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accno , String accholder, double bal){
        accountNumber=accno;
        accountHolderName=accholder;
        balance=bal;
    }

    void Deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Amount Deposited Successfully");
        }
        else{
            System.out.println("Invalid deposit Amount.");
        }
    }
    void withdrawl(double amount){
 if(amount<=0){
    System.out.println("Invalid withdrawl amount");
 }
 else if(amount>balance){
 System.out.println("Insufficient balance");
 }
 else{
    balance-=amount;
    System.out.println("withdrawl successful.");
 }
    }

    void displayBalance(){
        System.out.println("Current Balance: Rs" + balance);
    }

    void displayDetails(){
        System.out.println("Account Details:");
        System.out.println("Account Number: " +accountNumber );
        System.out.println("Account Holder: " +accountHolderName);
        System.out.println("Current Balance: Rs" + balance);
    }

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter account no:");
    int accno = scanner.nextInt();
    scanner.nextLine(); 
     System.out.println("enter account holder name:");
      String name = scanner.nextLine();
       System.out.println("enter initial balance:");
       double balance = scanner.nextDouble();
       BankAccount account = new BankAccount(accno, name, balance);
       int choice;
       do{
        System.out.println("1. deposit");
        System.out.println("2. withdraw");
        System.out.println("3. display balance");
        System.out.println("4. display account details");
        System.out.println("5. exit");
        
        System.out.println("enter choice:");
        choice=scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter deposit amount:");
                double deposit = scanner.nextDouble();
                account.Deposit(deposit);

                case 2:
                    System.out.println("enter withdrawl amount:");
                    double withdraw = scanner.nextDouble();
                    account.withdrawl(withdraw);

                    case 3:
                        account.displayBalance();
                        break;

                        case 4:
                            account.displayDetails();
                            break;

                            case 5:
                                System.out.println("thankyou !");
                                break;

                                default:
                                    System.out.println("invalid choice");
        }
    }
        while(choice!=5);
        scanner.close();
       
    
}

 }