package part4.task4;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deductCommission() {
        double commission = 0.05;
        balance -= balance * commission;
    }
}