package part5.task1;

public class Truck extends Vehicle {
    // Додаткові поля для підкласу Truck
    private int loadCapacity;
    public Truck(String color, int loadCapacity) {
        super(color);
        this.loadCapacity = loadCapacity;
    }
}
