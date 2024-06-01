package part2.task14;

public class CancelledOrderStatus implements OrderStatus {
    @Override
    public void process(Order order) {
    }

    @Override
    public void cancel(Order order) {
    }
}
