package Patterns.Structural.Composite;

public class Service implements TravelComponent {
    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayServiceDetails() {
        System.out.println(name + ": $" + price);
    }
}
