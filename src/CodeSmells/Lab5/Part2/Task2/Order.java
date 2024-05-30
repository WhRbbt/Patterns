package CodeSmells.Lab5.Part2.Task2;

public class Order {
    private Customer customer;
    private double amount;

    public Order(String customerName, double amount) {
        this.customer = new Customer(customerName);
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
