package Patterns.Structural.Bridge;

public class TravelType {
    public BookingSystem bookingSystem;

    public String arrangeTravel() {
        if (bookingSystem != null) {
            return bookingSystem.bookTicket();
        }
        return "Booking system is empty";
    }

    public double calculatePrice() {
        if (bookingSystem != null) {
            return bookingSystem.getPrice();
        }
        return 0.0;
    }
}