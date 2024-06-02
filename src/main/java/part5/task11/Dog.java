package part5.task11;

public class Dog {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    void eat() {
        animal.eat();
    }

    void sleep() {
        animal.sleep();
    }
}