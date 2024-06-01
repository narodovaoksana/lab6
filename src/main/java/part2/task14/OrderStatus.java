package part2.task14;

public interface OrderStatus {
    void process(Order order);

    void cancel(Order order);
}