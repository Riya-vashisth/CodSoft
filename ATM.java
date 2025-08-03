import java.util.Scanner;

public class ATM {
  private BankAccount account;
  private  Scanner input;
   
  public ATM(BankAccount account) {
    this.account = account;
    this.input  = new Scanner(System.in);
  }
  public void run() {
    while(true) {
        System.out.println("\nWelcome to ATM Interface");
        System.out.println("Option Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit"); 
        System.out.print("Choose an option ");

        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.err.println("Total Balance : Rs. " + account.getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to deposit : Rs. ");
                Double depositAmount = input.nextDouble();
                account.deposit(depositAmount);
                System.out.println("\n Amount Deposited Rs." + depositAmount);
                System.out.println("Your current balance is : Rs. " + account.getBalance());
                break;
            case 3:
                System.out.print("Enter the amount to withdraw : Rs. ");
                double withdrawAmount = input.nextDouble();
                if(account.withdraw(withdrawAmount)) {
                    System.out.println("\nAmount withdrawn Rs. " + withdrawAmount);
                    System.out.println("Your current balance is : Rs. " + account.getBalance());
                } else {
                    System.out.println("Insufficient balance"); 
                  
                }
                break;
            case 4: 
                System.out.println("Thankyou for using the ATM");
                return;
            default :
                System.out.println("Invalid option");    
        }
    }
  }
}



