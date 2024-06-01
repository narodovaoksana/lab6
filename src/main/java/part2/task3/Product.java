package part2.task3;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    // Створимо статичний метод для отримання екземпляра валюти
    public static Currency getCurrency(String code) {
        // Можна реалізувати кешування екземплярів Currency для покращення продуктивності
        return new Currency(code);
    }

    public Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currency = getCurrency(currencyCode); // Тепер ми використовуємо один екземпляр валюти для всіх продуктів з однаковою валютою
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