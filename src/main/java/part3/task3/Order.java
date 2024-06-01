package part3.task3;

public class Order {
    public void processOrder(int quantity, double price) {
        if (quantity > 10) {
            // Дубльований фрагмент
            applyDiscount();
            // Операція 1
        } else {
            // Операція 1
        }
        if (price > 100) {
            // Дубльований фрагмент
            applyDiscount();
            // Операція 2
        } else {
            // Операція 2
        }
    }

}
