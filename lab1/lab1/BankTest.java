package lab1;

public class BankTest {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Denis", AccountType.SAVINGS);
        BankAccount acc2 = new BankAccount("Aliya", AccountType.BUSINESS);

        acc1.deposit(500);
        acc1.withdraw(100);

        acc2.deposit(1000, "USD");
        acc2.withdraw(200);

        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
