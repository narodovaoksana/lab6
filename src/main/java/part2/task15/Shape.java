package part2.task15;

public class Shape {
    private double areaFormula;
    private double perimeterFormula;

    public Shape(double areaFormula, double perimeterFormula) {
        this.areaFormula = areaFormula;
        this.perimeterFormula = perimeterFormula;
    }

    public double getArea(double... args) {
        return areaFormula;
    }

    public double getPerimeter(double... args) {
        return perimeterFormula;
    }
}