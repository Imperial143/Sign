public class BankService {
    public static void main(String[] args) {
        double balance = 1000;  // initial balance
        double depositAmount = 500;
        double withdrawAmount = 200;
        System.out.println("Initial balance: " + balance);
        // Deposit
        balance += depositAmount;
        System.out.println("After depositing " + depositAmount + ", balance is: " + balance);
        // Withdraw
        if (withdrawAmount > balance) {
            System.out.println("Cannot withdraw " + withdrawAmount + ", insufficient balance!");
        } else {
            balance -= withdrawAmount;
            System.out.println("After withdrawing " + withdrawAmount + ", balance is: " + balance);
        }
        // Check balance
        System.out.println("Final balance: " + balance);
    }
}
