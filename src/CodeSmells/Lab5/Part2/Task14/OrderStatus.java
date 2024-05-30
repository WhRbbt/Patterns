package CodeSmells.Lab5.Part2.Task14;

public abstract class OrderStatus {
    public abstract int getStatus();

    public static OrderStatus getStatus(int type) {
        return switch (type) {
            case Order.NEW -> new NewStatus();
            case Order.PROCESSING -> new ProcessingStatus();
            case Order.COMPLETED -> new CompletedStatus();
            case Order.CANCELLED -> new CancelledStatus();
            default -> throw new IllegalArgumentException("Invalid status type");
        };
    }
}