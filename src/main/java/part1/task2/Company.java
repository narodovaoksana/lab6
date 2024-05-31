package part1.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private Map<Employee, Double> salaries;

    // Конструктор та інші методи класу...

    public Company(List<Employee> employees) {
        this.employees = employees;
        this.salaries = new HashMap<>();
        for (Employee employee : employees) {
            this.salaries.put(employee, 0.0);
        }
    }

    public void setSalary(Employee employee, double salary) {
        this.salaries.put(employee, salary);
    }

    public double getSalary(Employee employee) {
        return this.salaries.get(employee);
    }

    public void printEmployeeSalaries() {
        for (Map.Entry<Employee, Double> entry : salaries.entrySet()) {
            Employee employee = entry.getKey();
            double salary = entry.getValue();
            System.out.println(employee.getName() + ": " + salary);
        }
    }
}