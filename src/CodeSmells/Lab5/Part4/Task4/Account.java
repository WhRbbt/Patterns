package CodeSmells.Lab5.Part4.Task4;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void subtractCommission() {
        double commission = 0.05;
        balance -= balance * commission;
    }

    public double getBalance() {
        return balance;
    }
}