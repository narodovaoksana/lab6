package part4.task7;

public class ProcessPerson {
    public void process(Person person) {
        System.out.println("Processing of the individual:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}