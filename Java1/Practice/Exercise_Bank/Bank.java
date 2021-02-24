package Java1.Practice.Exercise_Bank;

public class Bank {
    private double balance;
    private double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest() {
        double annualInterestRate = rate * 100 / 10;
        return balance * (annualInterestRate / 1200);
    }
}
