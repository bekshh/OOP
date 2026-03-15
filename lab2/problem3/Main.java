package problem3;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1001, 5);
        CheckingAccount c1 = new CheckingAccount(2001);

        s1.deposit(1000);
        c1.deposit(500);

        bank.openAccount(s1);
        bank.openAccount(c1);

        c1.withdraw(100);
        c1.withdraw(50);
        c1.withdraw(50);
        c1.withdraw(50);

        bank.update();

        bank.printAccounts();
    }
}