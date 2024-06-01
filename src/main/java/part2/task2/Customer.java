package part2.task2;

public class Customer {
    private String name;
    private double discountRate;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
