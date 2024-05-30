package CodeSmells.Lab5.Part2.Task14;

public class ProcessingStatus extends OrderStatus {
    @Override
    public int getStatus() {
        return Order.PROCESSING;
    }
}