public class AtmInterface {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(5000);
        ATM atm = new ATM(user);
        atm.run();
    }
}
