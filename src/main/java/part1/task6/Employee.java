package part1.task6;

public class Employee {
    private String name;
    private Department department;
    // Конструктор та інші методи класу...
    public String getDepartmentManagerName() {
        return department.getManagerName();
    }
}
