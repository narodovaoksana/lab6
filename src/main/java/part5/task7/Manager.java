package part5.task7;

class Manager {
    private String name;
    private double salary;
    private String department;
    public Manager(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}
