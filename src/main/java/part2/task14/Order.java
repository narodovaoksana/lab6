package part2.task14;

public class Order {
    private OrderStatus status;

    public Order() {
        this.status = new NewOrderStatus();
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void process() {
        status.process(this);
    }

    public void cancel() {
        status.cancel(this);
    }
}