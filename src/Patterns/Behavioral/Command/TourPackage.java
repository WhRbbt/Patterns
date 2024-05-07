package Patterns.Behavioral.Command;

public class TourPackage implements TravelPackage {
    private String destination;

    public TourPackage(String destination) {
        this.destination = destination;
    }

    @Override
    public void book() {
        System.out.println("Booking tour package to " + destination);
    }
}