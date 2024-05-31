package part2.task3;

public class Product {
    private String name;
    private double price;
    private Currency currency;
    // Конструктор та інші методи класу...
    public Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currency = new Currency(currencyCode); // Кожний продукт має свійекземпляр валюти
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCurrencyCode() {
        return currency.getCode();
    }
    // Інші методи класу...
}