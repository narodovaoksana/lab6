package part5.task7;

public class Person {
    private String name;
    private double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}



