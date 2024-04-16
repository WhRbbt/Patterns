package Patterns.Structural.Bridge;

public class OnlineBookingSystem implements BookingSystem {
    public String bookTicket() {
        return "Ticket booked online";
    }

    public double getPrice() {
        return 100.0;
    }
}