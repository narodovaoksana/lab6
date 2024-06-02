package exam.task23;

public class BankAccount {
    private String currency;
    private double balance;

    public BankAccount(String currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }

    public double getBalance() {
        if (currency.equals("USD")) {
            // конвертація валюти для USD
            return balance * 1.1;
        } else if (currency.equals("EUR")) {
            // конвертація валюти для EUR
            return balance * 0.9;
        } else {
            // невідома валюта
            throw new UnsupportedOperationException("Unknown currency");
        }
    }

    public void deposit(double amount) {
        if (currency.equals("USD")) {
            // комісія для USD
            balance += amount * 0.95;
        } else if (currency.equals("EUR")) {
            // комісія для EUR
            balance += amount * 0.98;
        } else {
            // невідома валюта
            throw new UnsupportedOperationException("Unknown currency");
        }
    }
}