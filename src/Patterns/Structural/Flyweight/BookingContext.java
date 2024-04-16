package Patterns.Structural.Flyweight;

public class BookingContext {
    private final String customerName;
    private final String bookingDate;
    private final DestinationFlyweight destination;

    public BookingContext(String customerName, String bookingDate, DestinationFlyweight destination) {
        this.customerName = customerName;
        this.bookingDate = bookingDate;
        this.destination = destination;
    }

    public void displayDetails() {
        destination.displayBookingDetails(customerName, bookingDate);
    }
}
