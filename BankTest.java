
class BankAccount {

    private int accountNumber;
    private double balance;

    static int count = 0;

    final int accountId;

    BankAccount(int accountNumber, double balance, int accountId) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountId = accountId;

        count++;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }

        else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }

        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }

        else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    double getBalance() {
        return balance;
    }

    void display() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
    }
}

public class BankTest {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(12345, 5000, 101);

        b1.display();

        System.out.println();

        b1.deposit(2000);

        b1.withdraw(1000);

        System.out.println("Current Balance: " + b1.getBalance());

        System.out.println("Total Accounts: " + BankAccount.count);
    }
}
