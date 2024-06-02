package part5.task6;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    private int salary;
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}