package part2.task1;

public class Employee {
    private String name;
    private double salary;

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }
    // Інші методи класу...
}