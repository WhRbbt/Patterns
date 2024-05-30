package CodeSmells.Lab5.Part5.Task4;

public class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eats Royal Canin");
    }
}