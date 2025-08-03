public class BankAccount {
    double Balance ;
     public  BankAccount(double initialbalance) {
        this.Balance = initialbalance;
     } 
     public double getBalance() {
        return Balance;
     }
     public void deposit(double amount) {
        if (amount >0) {
            Balance += amount;
        }
     }
     public boolean withdraw(double amount) {
        if (amount > 0 && amount <=Balance) {
            Balance -= amount;
            return true;
        }
        return false;
     }
}