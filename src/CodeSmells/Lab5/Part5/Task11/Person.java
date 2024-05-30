package CodeSmells.Lab5.Part5.Task11;

public class Person {
    private final Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}
