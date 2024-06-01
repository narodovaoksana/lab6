package part2.task14;

public class Order {
    private int status;
    public static final int NEW = 0;
    public static final int PROCESSING = 1;
    public static final int COMPLETED = 2;
    public static final int CANCELLED = 3;
    public Order() {
        this.status = NEW;
    }
    // Інші методи класу...
}