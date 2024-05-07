package Patterns.Behavioral.Mediator;

public class FlightBooking {
    private Mediator mediator;

    public FlightBooking(Mediator mediator) {
        this.mediator = mediator;
    }

    public void bookFlight() {
        System.out.println("Flight booked successfully");
    }
}