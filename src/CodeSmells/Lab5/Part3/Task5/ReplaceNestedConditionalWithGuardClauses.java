package CodeSmells.Lab5.Part3.Task5;

public class ReplaceNestedConditionalWithGuardClauses {
    public void processOrder(int quantity, double price) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (price <= 0) {
            System.out.println("Invalid price");
            return;
        }

        System.out.println("Order processed successfully");
    }
}
