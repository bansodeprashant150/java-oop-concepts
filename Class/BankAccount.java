public class BankAccount {

    String accountHolder;
    int balance;
    int accountNumber;

    // deposit method
    void deposit(int amount) {

        if(amount > 0) {
            balance += amount;
        }
    }

    // withdraw method
    void withdraw(int amount) {

        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // display details
    void showDetails() {

        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
        System.out.println("Account Number : " + accountNumber);
    }

    public static void main(String[] args) {

        // first account
        BankAccount acc1 = new BankAccount();

        acc1.accountHolder = "Prashant";
        acc1.accountNumber = 101;
        acc1.balance = 5000;

        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc1.showDetails();

        System.out.println();

        // second account
        BankAccount acc2 = new BankAccount();

        acc2.accountHolder = "Rahul";
        acc2.accountNumber = 102;
        acc2.balance = 3000;

        acc2.deposit(1000);
        acc2.withdraw(500);

        acc2.showDetails();
    }
}
