package part2.task2;

public class Order {
    private String customer;
    private double amount;
    // Конструктор та інші методи класу...
    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    // Інші методи класу...
}