package Patterns.Structural.Flyweight;

public class Destination implements DestinationFlyweight {
    private String name;
    private String description;
    private String location;

    public Destination(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    @Override
    public void displayBookingDetails(String customerName, String bookingDate) {
        System.out.println("Booking Details: ");
        System.out.println("Customer: " + customerName);
        System.out.println("Date: " + bookingDate);
        System.out.println("Destination: " + name);
        System.out.println("Description: " + description);
        System.out.println("Location: " + location);
    }
}
