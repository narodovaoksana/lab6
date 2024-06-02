package part5.task6;

public class Employee {
    private String name;
    private int salary;
    private int bonus;

    public Employee(String name, int salary, int bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        if (bonus!= 0) {
            System.out.println("Bonus: " + bonus);
        }
    }
}
