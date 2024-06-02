package part3.task6;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Circle circle = new Circle(5.0);
        double area = calculator.calculateArea(circle);
        System.out.println("Area of the circle: " + area);

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        area = calculator.calculateArea(rectangle);
        System.out.println("Area of a rectangle: " + area);
    }
}