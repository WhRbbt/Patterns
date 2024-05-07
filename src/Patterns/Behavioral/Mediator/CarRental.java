package Patterns.Behavioral.Mediator;

public class CarRental {
    private Mediator mediator;

    public CarRental(Mediator mediator) {
        this.mediator = mediator;
    }

    public void rentCar() {
        System.out.println("Car rented successfully");
    }
}