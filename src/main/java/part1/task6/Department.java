package part1.task6;

public class Department {
    private String name;
    private Employee manager;

    // Конструктор та інші методи класу...
    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}