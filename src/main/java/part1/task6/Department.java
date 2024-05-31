package part1.task6;

public class Department {
    private String name;
    private Employee manager;
    // Конструктор та інші методи класу...
    public String getManagerName() {
        return manager.getName();
    }
}
