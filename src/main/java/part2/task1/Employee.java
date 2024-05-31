package part2.task1;

public class Employee {
    private String name;
    private double salary;
    // Конструктор та інші методи класу...
    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
    public double getSalary() {
        return salary;
    }
    // Інші методи класу...
}