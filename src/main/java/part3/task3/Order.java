package part3.task3;

public class Order {
    public void processOrder(int quantity, double price) {
        boolean discountApplied = false;
        if (quantity > 10) {
            discountApplied = true;
            // Операція 1
        }
        if (price > 100) {
            discountApplied = true;
            // Операція 2
        }
        if (discountApplied) {
            this.applyDiscount();
        }
    }

    private void applyDiscount() {
    }
}
