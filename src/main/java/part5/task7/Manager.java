package part5.task7;

public class Manager extends Person {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
