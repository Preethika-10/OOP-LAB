class BankAccount {
    private int accountNumber;          // cannot be accessed directly
    private double balance;             // cannot be accessed directly
    protected String accountHolderName; // accessible in class & subclasses

    public static final double BANK_INTEREST_RATE = 7.5; // constant for all accounts

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double calculateInterest() {
        return balance * (BANK_INTEREST_RATE / 100);
    }

    public void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + BANK_INTEREST_RATE + "%");
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (BANK_INTEREST_RATE / 100) * 1.1; // 10% extra interest
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }
}

public class BankAcc {
    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount(101, "Alice", 10000);
        CurrentAccount cAcc = new CurrentAccount(102, "Bob", 20000);
        sAcc.deposit(500);
        cAcc.withdraw(5000);
        sAcc.display();
        System.out.println("Savings Account Interest: " + sAcc.calculateInterest());
        System.out.println("----------------------------");
        cAcc.display();
        System.out.println("Current Account Interest: " + cAcc.calculateInterest());
    }
}