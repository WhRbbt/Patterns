package Patterns.Structural.Bridge;

public class AirTravel extends TravelType {
    public AirTravel(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }
}