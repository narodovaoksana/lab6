package part4.task12;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void register() {
        System.out.println("Car registered successfully!");
    }

    // Інші методи класу
}