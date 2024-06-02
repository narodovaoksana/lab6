package part4.task2;

public class calculateTotal {
    public double calculateTotal(double price, int quantity, double taxRate) {
        double subtotal = price * quantity;
        return subtotal + (subtotal * taxRate);
    }
}
