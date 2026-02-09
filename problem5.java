package test;

public class problem5 {
    public static void main(String[] args) {

        double balance = 1000.0;   // initial balance
        double interestRate = 5.0; // interest in %

        double interest = balance * interestRate / 100;
        double newBalance = balance + interest;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + newBalance);
    }
}
