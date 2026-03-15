package problem3;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accNumber, double rate) {
        super(accNumber);
        interestRate = rate;
    }

    public void addInterest() {

        double interest = getBalance() * interestRate / 100;
        deposit(interest);

    }

    public String toString() {
        return "Savings " + super.toString();
    }
}