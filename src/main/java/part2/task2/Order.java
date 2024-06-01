package part2.task2;

public class Order {
    private Customer customer;
    private double amount;

    public Order(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
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