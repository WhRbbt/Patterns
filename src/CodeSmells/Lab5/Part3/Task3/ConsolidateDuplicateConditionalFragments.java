package CodeSmells.Lab5.Part3.Task3;

public class ConsolidateDuplicateConditionalFragments {
    public void processOrder(int quantity, double price) {
        boolean discountApplied = false;

        if (quantity > 10) {
            applyDiscount();
            discountApplied = true;
        }

        if (price > 100) {
            if (!discountApplied) {
                applyDiscount();
            }
        }
    }

    public void applyDiscount(){
        System.out.println("Price Discounted");
    }
}
