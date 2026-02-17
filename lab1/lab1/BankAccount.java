package lab1;

public class BankAccount {

    private static int totalAccounts = 0;   // static поле

    private final int accountNumber;        // final поле
    private String owner;
    private double balance;
    private AccountType type;

    // Инициализационный блок
    {
        balance = 0;
    }

    public BankAccount(String owner, AccountType type) {
        this.owner = owner;     // использование this
        this.type = type;
        totalAccounts++;
        this.accountNumber = totalAccounts;
    }

    // Перегрузка метода deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void deposit(double amount, String currency) {
        if (currency.equalsIgnoreCase("USD")) {
            deposit(amount);
        } else {
            System.out.println("Only USD accepted");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber +
               " | Owner: " + owner +
               " | Type: " + type +
               " | Balance: " + balance;
    }
}
