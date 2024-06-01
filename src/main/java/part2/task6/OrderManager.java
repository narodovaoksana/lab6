package part2.task6;

import java.util.List;

public class OrderManager {
    private List<Order> orders;
    // Конструктор, геттери і сеттери, інші методи класу...
    public void addOrder(Order order) {
        orders.add(order);
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }
    // Інші методи для управління замовленнями...
}
