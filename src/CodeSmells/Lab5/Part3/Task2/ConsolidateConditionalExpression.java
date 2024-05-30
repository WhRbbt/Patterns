package CodeSmells.Lab5.Part3.Task2;

public class ConsolidateConditionalExpression {
    public void processPayment(double amount, boolean isMember, boolean isDiscountAvailable) {
        if ((amount > 100 && isMember) || (amount > 200 && isDiscountAvailable)) {
            applyDiscount();
        }
    }

    public void applyDiscount(){
        System.out.println("Price Discounted");
    }
}
