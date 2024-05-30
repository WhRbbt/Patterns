package CodeSmells.Lab5.Part2.Task14;

public class Order {
    private OrderStatus status;

    public static final int NEW = 0;
    public static final int PROCESSING = 1;
    public static final int COMPLETED = 2;
    public static final int CANCELLED = 3;

    public Order() {
        this.status = OrderStatus.getStatus(NEW);
    }

    public int getStatus() {
        return status.getStatus();
    }

    public void setStatus(int status) {
        this.status = OrderStatus.getStatus(status);
    }
}