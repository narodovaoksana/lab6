package part2.task15;

public class Circle extends Shape {
    // Інші поля та методи
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
