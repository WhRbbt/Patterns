package CodeSmells.Lab5.Part5.Task9;

public class Animal {
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

    public void bark() {
        if ("Dog".equalsIgnoreCase(this.species)) {
            System.out.println("The dog is barking.");
        } else {
            System.out.println("This animal cannot bark.");
        }
    }
}
