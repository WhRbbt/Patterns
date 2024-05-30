package CodeSmells.Lab5.Part4.Task2;

public class AddParameter {
    public double calculateTotal(double price, int quantity, double taxRate) {
        return price * quantity * taxRate;
    }
}
