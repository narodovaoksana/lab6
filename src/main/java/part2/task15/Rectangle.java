package part2.task15;

public class Rectangle extends Shape {
    // Інші поля та методи
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
