package part5.task9;

class Animal {
    private String species;
    public Animal(String species) {
        this.species = species;
    }
    public void eat() {
        System.out.println("The animal is eating.");
    }
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}