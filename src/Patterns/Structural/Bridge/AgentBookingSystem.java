package Patterns.Structural.Bridge;

public class AgentBookingSystem implements BookingSystem {
    public String bookTicket() {
        return "Ticket booked by agent";
    }

    public double getPrice() {
        return 120.0;
    }
}