package part4.task7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Oksana Narodova", 18, "29 Main St.");
        ProcessPerson processPerson = new ProcessPerson();
        processPerson.process(person);
    }
}