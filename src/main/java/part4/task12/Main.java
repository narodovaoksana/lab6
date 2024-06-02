package part4.task12;

public class Main {
    public static Car createCar(String brand, String model, int year, String color) {
        Car car = new Car(brand, model, year, color);
        car.register();
        return car;
    }
}