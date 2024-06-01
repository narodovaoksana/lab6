package part3.task5;

public class processOrder {
    public void processOrder(int quantity, double price) {
        if (quantity > 0) {
            if (price > 0) {
                // Основна логіка
                System.out.println("Order processed successfully");
            } else {
                System.out.println("Invalid price");
            }
        } else {
            System.out.println("Invalid quantity");
        }
    }
}
